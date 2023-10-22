package org.extendedweb.aloft.utils.sys.shell;

public abstract class Run extends Command {

    public abstract void lineRead(byte[] bytes, String line);

    private Status status;

    public Run(String command) throws Exception {
        status = exec(command);
    }

    public Status getStatus() {
        return status;
    }

    public String getStatusString() {
        return "\nProcess exited with exit code ?";
    }

}
