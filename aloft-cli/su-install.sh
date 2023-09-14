#!/bin/bash

if [ "$EUID" -ne 0 ]
  then echo "Couldn't authenticate as root."
  exit 1
fi

mkdir -p /usr/local/lib/aloft/cli
cp target/cli-1.0-jar-with-dependencies.jar /usr/local/lib/aloft/cli/cli.jar
cp aloft /usr/local/bin
chmod 0755 /usr/local/bin/aloft
chmod -R 0755 /usr/local/lib/aloft