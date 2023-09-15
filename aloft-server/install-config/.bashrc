cd /home/aloft
readonly JAR_CMD="rjar ${HOME}/lib/server.jar"
readonly PATH=$HOME/bin:$HOME/sites:$HOME/lib
readonly START_SERVER="rsudo ${JAR_CMD} ${@}"
export PATH
alias aloft-server="$START_SERVER"