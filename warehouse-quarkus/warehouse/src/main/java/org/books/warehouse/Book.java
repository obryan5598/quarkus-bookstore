package org.books.warehouse;

import javax.persistence.*;
import java.util.List;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
public class Book extends PanacheEntity {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    public String ISBN;
    public String title;
    public String author;
    public Long price;
    public Integer quantity;

    public static List<Book> findByTitle(String title) {
        return find("title", title).list();
    }

    public static Book findByISBN(String ISBN) {
	return find("ISBN", ISBN).firstResult();
    }

}
