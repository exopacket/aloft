#!/bin/bash

if [ "$EUID" -ne 0 ]
  then echo "Couldn't authenticate as root."
  exit 1
fi

mkdir -p /usr/local/lib/aloft/server
cp target/server-1.0-jar-with-dependencies.jar /usr/local/lib/aloft/server/server.jar
cp aloft-server /usr/local/bin
chmod 0755 /usr/local/bin/aloft-server
chmod -R 0755 /usr/local/lib/aloft