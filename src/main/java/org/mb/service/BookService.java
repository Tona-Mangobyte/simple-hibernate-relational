package org.mb.service;

import org.mb.config.HibernateUtil;
import org.mb.model.Book;

import javax.persistence.EntityManager;

public class BookService {

    public void create() throws Exception {
        Book book = new Book();
        book.setTitle("Effective Java3");
        book.setAuthor("Joshua Bloch");
        book.setPrice(32.59f);

        EntityManager entityManager = HibernateUtil.getEntityManager();
        entityManager.getTransaction().begin();
        entityManager.merge(book);
        entityManager.getTransaction().commit();
    }
}
