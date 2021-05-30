package org.example;
import org.slf4j.Logger;

import javax.inject.Inject;
import javax.ws.rs.*;
import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.toList;
import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

@Path("/contacts")
public class ContactsResource {

    @Inject
    private Logger log;

    private final List<Contact> contacts = new ArrayList<>(List.of(
            new Contact("Bram", 41, 1),
            new Contact("David", 27, 2),
            new Contact("Rutger", 33, 3),
            new Contact("Debby", 33, 4)
    ));


    @GET
    @Produces(APPLICATION_JSON)
    public List<Contact> getQ(@QueryParam("name") String n) {
        return n == null ?
                this.contacts :
                contacts.stream()
                        .filter(c -> c.getName().contains(n))
                        .collect(toList());
    }

    @POST
    @Produces(APPLICATION_JSON)
    @Consumes(APPLICATION_JSON)
    public Contact post(Contact contact) {
        this.contacts.add(contact);
        System.out.println(contacts);
        return contact;
    }
}
