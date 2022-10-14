package io.getarrays.server.model;
import io.getarrays.server.enumeration.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

import static javax.persistence.GenerationType.AUTO;


//Class representing the servers
@Entity
@Data // for the getters and setters from Lombok
@NoArgsConstructor
@AllArgsConstructor
public class Server {

    @Id
    @GeneratedValue(strategy = AUTO) // Specify how to generate @Id (this is from java persistence)
    private Long id; // id of the server and a primary key in the database

    @Column(unique = true) // creates a constraint on an IP address not allowing multiple ip's with the same number

    @NotEmpty(message = "IP address cannot be empty or null") // validation on IP address,
    // Checked in Controller class "ServerResource" by "saveServer"

    private String ipAddress;
    private String name; // name of the server
    private String memory;
    private String type;
    private String imageUrl;
    private Status status;  // Enum
}
