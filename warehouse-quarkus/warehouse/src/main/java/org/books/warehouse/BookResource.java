package org.books.warehouse;

import javax.ws.rs.core.MediaType;

import org.jboss.logging.Logger;
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
import javax.ws.rs.PathParam;

import io.quarkus.panache.common.Sort;

@Path("books")
@ApplicationScoped
@Produces("application/json")
@Consumes("application/json")
public class BookResource {

    private static final Logger LOGGER = Logger.getLogger(BookResource.class.getName());
    
    @GET
    public List<Book> get() {
	LOGGER.info("Returning all books");
        List<Book> books = Book.listAll(Sort.by("title"));
	books.stream().forEach(b -> { 
		LOGGER.debug("{ ");
		LOGGER.debug("Title: " +  b.title);
		LOGGER.debug("Author: " +  b.author);
		LOGGER.debug("ISBN: " +  b.ISBN);
		LOGGER.debug("Price: " +  b.price);
		LOGGER.debug(" }");
	});

	return books;
    }

    @GET
    @Path("/ISBN/{ISBN}")
    public Book getByISBN(@PathParam("ISBN") String ISBN) {
	LOGGER.info("Returning book by ISBN");
        Book b = Book.findByISBN(ISBN);
	
	LOGGER.debug("{ ");
	LOGGER.debug("Title: " +  b.title);
	LOGGER.debug("Author: " +  b.author);
	LOGGER.debug("ISBN: " +  b.ISBN);
	LOGGER.debug("Price: " +  b.price);
	LOGGER.debug(" }");

	return b;
    }

}
