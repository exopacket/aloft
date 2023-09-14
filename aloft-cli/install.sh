#!/bin/bash

STARTING_USER="$EUID"

if [ "$STARTING_USER" -eq 0 ]
  then echo "Please do not execute this script as root."
  exit
fi

if command -v java &> /dev/null; then
    _java=$(which java)
elif [[ -n "$JAVA_HOME" ]] && [[ -x "$JAVA_HOME/bin/java" ]];  then
    _java="$JAVA_HOME/bin/java"
else
    echo "You do not have Java installed."
    exit
fi

if [[ "$_java" ]]; then
    version=$("$_java" -version 2>&1 | awk -F '"' '/version/ {print $2}')
    if [[ "$version" < "18" ]]; then
        echo "Your Java version is '$version' and aloft requires at least version 18."
        exit 1
    fi
fi

if ! command -v mvn &> /dev/null
then
    echo "maven CLI could not be found"
    exit
fi

mvn install
SU_INSTALL="sudo bash su-install.sh"
$SU_INSTALL
STATUS=$?

if [ "$STATUS" -ne 0 ]; then
  echo "failed to install the aloft CLI!"
  exit;
fi

echo "aloft CLI successfully installed."