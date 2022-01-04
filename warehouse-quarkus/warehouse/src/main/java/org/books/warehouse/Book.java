package org.books.warehouse;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import javax.persistence.Entity;
import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
public class Book extends PanacheEntity {

    public String ISBN;
    public String title;
    public String author;
    public Long price;
    public Integer quantity;

    public Book() {}

}
