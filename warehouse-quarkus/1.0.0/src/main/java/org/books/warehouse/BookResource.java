package org.books.warehouse;

import javax.ws.rs.core.MediaType;

import javax.persistence.Entity;
import io.quarkus.hibernate.orm.panache.PanacheEntity;

import io.quarkus.panache.common.Sort;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("books")
@ApplicationScoped
@Produces("application/json")
@Consumes("application/json")
public class BookResource {

    private static final Logger LOGGER = Logger.getLogger(BookResource.class.getName());

    @GET
    public List<Book> get() {
        return Book.listAll(Sort.by("name"));
    }
}
