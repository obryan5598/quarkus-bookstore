package org.books.warehouse;

import javax.persistence.Column;
import javax.persistence.Entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
public class Book extends PanacheEntity {

    @Column(name="ISBN")
    public String ISBN;
    @Column(name="TITLE")
    public String title;
    @Column(name="AUTHOR")
    public String author;
    @Column(name="PRICE")
    public Long price;
    @Column(name="QUANTITY")
    public Integer quantity;

    public Book() {}

}
