package io.getarrays.server.service;
import io.getarrays.server.model.Server;

import java.io.IOException;
import java.util.Collection;

// Defining all the functionality and features the application would have

public interface ServerService {
    Server create(Server server); //save the server i na the DB
    Server ping(String ipAddress) throws IOException; // pings the server and returns the server that is supposed to be pinged
    Collection<Server> list(int limit); // list all the servers ,"list (int limit) method"- defines how many servers the method will be returning when called
    Server get(Long id); // gets the id of the server to be found.
    Server update(Server server); //give it a server to update takes the server with the updated info and store it in a DB
    Boolean delete(Long id); // goes in the DB ,finds the server and deletes it
}
