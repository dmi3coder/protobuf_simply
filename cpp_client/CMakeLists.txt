cmake_minimum_required(VERSION 3.7)
project(cpp_client)


set(CMAKE_CXX_STANDARD 11)


set(SOURCE_FILES
        client.cpp
        mongoose.c
        mongoose.h
        notes.pb.cc
        notes.pb.h)

add_executable(cpp_client ${SOURCE_FILES})