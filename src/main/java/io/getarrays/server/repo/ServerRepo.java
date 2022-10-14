package io.getarrays.server.repo;

import io.getarrays.server.model.Server;
import org.springframework.data.jpa.repository.JpaRepository;

// Managing the server giving the ability to update, delete , read all the servers in the DB

public interface ServerRepo extends JpaRepository<Server, Long> {
    Server findByIpAddress(String ipAddress); // select a server and compare it with IpAddress in param's
}
