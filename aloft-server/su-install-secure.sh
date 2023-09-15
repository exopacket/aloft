#!/bin/bash

echo "UNTESTED... COMMENT THIS AND NEXT LINE IN SCRIPT TO CONTINUE."
exit 0

if [ "$EUID" -ne 0 ]
  then echo "Couldn't authenticate as root."
  exit 1
fi

mkdir -p /usr/local/lib/aloft/server
cp target/server-1.0-jar-with-dependencies.jar /usr/local/lib/aloft/server/server.jar
cp aloft-server /usr/local/bin
chmod 0755 /usr/local/bin/aloft-server
chmod -R 0755 /usr/local/lib/aloft

cp install-config/rjar /bin/rjar
cp install-config/rsudo /bin/rsudo
chmod 0755 /bin/rjar
chmod 0755 /bin/rsudo

mkdir /home/aloft
mkdir /home/aloft/bin
mkdir /home/aloft/lib
mkdir /home/aloft/sites

cp install-config/.bashrc /home/aloft/.bashrc
chown aloft:root /home/aloft/.bashrc
chmod 0555 /home/aloft/.bashrc

RAND_PASSWD=$(openssl rand -base64 64)
ENCRYPTED_PASSWD=$(openssl passwd -1 "$RAND_PASSWD")

useradd aloft -s /bin/rbash
usermod -d /home/aloft aloft
usermod -p "$ENCRYPTED_PASSWD"
usermod -L aloft

chown -R aloft:aloft /home/aloft

ln -s /usr/bin/java /home/aloft/bin/java
ln -s /usr/bin/rjar /home/aloft/bin/rjar
ln -s /usr/bin/rsudo /home/aloft/bin/rsudo

ln -s /usr/local/lib/aloft/server/server.jar /home/aloft/lib/server.jar