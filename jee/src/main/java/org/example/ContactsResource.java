package org.example;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

@Path("/contacts")
public class ContactsResource {

    private final List<Contact> contacts = new ArrayList<>(List.of(
            new Contact("Bram", 41, 1),
            new Contact("David", 27, 2),
            new Contact("Rutger", 33, 3),
            new Contact("Debby", 33, 4)
    ));

    @GET
    @Produces(APPLICATION_JSON)
    public List<Contact> get(){
             return this.contacts;
    }
}
