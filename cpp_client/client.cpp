#include <iostream>
#include "mongoose.h"
#include "notes.pb.h"
#include <string.h>

using namespace std;

static bool connected = 0;

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
                note.set_time(260);
                note.set_type(protocol::NoteType::BASIC);

                int size = note.ByteSize();
                printf("%d",size);
                char* array = new char[size];
                note.SerializeToArray(array, size);

                std::string outData = note.SerializeAsString();
                conn->flags = conn->flags|MG_EV_CLOSE;

                mg_send(conn, array, size);

                printf("%s\n", "Connected to server. Type a message and press enter.");
            }
        break;
        case MG_EV_SEND:
            closesocket(conn->sock);
        break;
        case MG_EV_RECV:
        {
            string receivedString = io->buf;
            cout << receivedString;
            cout << "MG_EV_RECV dude,for real! "<< a++ << endl;
        }
            break;
        case MG_EV_ACCEPT:
            break;
        case MG_EV_POLL:

        default:
            break;
    }
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