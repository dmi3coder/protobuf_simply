#!/usr/bin/env bash
g++ -I /usr/local/Cellar/protobuf/3.3.0/include -L /usr/local/lib client.cpp notes.pb.cc mongoose.c  -D_GLIBCXX_USE_CXX11_ABI=0 -o client -lprotobuf -pthread