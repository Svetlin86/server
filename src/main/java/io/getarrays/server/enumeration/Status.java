package io.getarrays.server.enumeration;

public enum Status {
    SERVER_UP("SERVER_UP"),
    SERVER_DOWN("SERVER_DOWN");
    private final String status;


    //Constructor
    Status(String status) {
        this.status = status;
    }

    public String getStatus() {
        return this.status;
    }
}
