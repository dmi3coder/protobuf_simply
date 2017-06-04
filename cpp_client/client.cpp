#include <iostream>
#include "mongoose.h"
#include "notes.pb.h"
#include <string.h>

using namespace std;
using namespace protocol;

static bool connected = 0;

static Envelope createEnvelope(Note *note);

static void client_handler(struct mg_connection *conn, int ev, void *p) {
    struct mbuf *io = &conn->send_mbuf;
    static int a  = 1;
    switch (ev) {
        case MG_EV_CONNECT:
            if (conn->flags & MG_F_CLOSE_IMMEDIATELY) {
                printf("%s\n", "Error connecting to server!");
                exit(EXIT_FAILURE);
            }else{
                protocol::Note note = protocol::Note();
                string name = "Купить кафель";
                string cafel = "Купить коричневый кафель";
                note.set_name(name);
                note.set_content(cafel);
                note.set_id(1);
                note.set_type(protocol::NoteType::BASIC);
                Envelope envelope = createEnvelope(&note);

                int size = envelope.ByteSize();
                printf("%d",size);
                char* array = new char[size];
                envelope.SerializeToArray(array, size);

                std::string outData = envelope.SerializeAsString();

                mg_send(conn, array, size);
            }
        break;
        case MG_EV_SEND:
        break;
        case MG_EV_RECV:
        {
            Envelope receivedEnvelope = Envelope();
            receivedEnvelope.ParseFromString((&conn->recv_mbuf)->buf);
            for (int i = 0; i < receivedEnvelope.note_size(); ++i) {
                cout << receivedEnvelope.note(i).DebugString() << endl;
            }
        }
            break;
        case MG_EV_ACCEPT:
            break;
        case MG_EV_POLL:
        default:
            cout << ev << endl;
            exit(0);
            break;
    }
}

static Envelope createEnvelope(Note *note){
  Envelope envelope = Envelope();
  *envelope.add_note() = *note;
  envelope.set_type(Envelope_Type::Envelope_Type_GET_ALL_NOTES);
  return envelope;
}

int main(int argc, const char * argv[]) {
    GOOGLE_PROTOBUF_VERIFY_VERSION;
    struct mg_mgr mgr;
    struct mg_connection *nc;
    printf("KAL");

    mg_mgr_init(&mgr, NULL);
    nc = mg_connect(&mgr, "tcp://127.0.0.1:27015", client_handler);
    if(nc != NULL){
        for(;;){
            mg_mgr_poll(&mgr, 1000);
        }
    }

    return 0;
}