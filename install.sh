#!/bin/bash

CWD=$(pwd)

cd aloft-server && bash install.sh
cd "$CWD" && cd aloft-cli && bash install.sh
cd "$CWD"
aloft init
