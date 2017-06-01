#!/usr/bin/env bash
protoc -I=$1/protobuf  --java_out=$1/java_client/src --cpp_out=$1/cpp_client  $1/protobuf/notes.proto