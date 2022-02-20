package org.mb.service;

import org.mb.config.HibernateUtil;
import org.mb.model.Book;
import org.mb.model.Order;
import org.mb.model.OrderDetail;

import javax.persistence.EntityManager;
import java.util.Date;

public class OrderService {
    public void create() throws Exception {
        Book book = new Book();
        // book.setId(1);
        book.setTitle("Effective Java3");
        book.setAuthor("Joshua Bloch");
        book.setPrice(32.59f);

        Order order = new Order();
        order.setOrderDate(new Date());
        order.setTotal(50d);
        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setQty(50L);
        orderDetail.setPrice(1d);
        orderDetail.setAmount(50d);
        orderDetail.setOrder(order);
        orderDetail.setBook(book);
        order.getOrderDetails().add(orderDetail);
        EntityManager entityManager = HibernateUtil.getEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(order);
        entityManager.persist(book);
        entityManager.persist(orderDetail);
        entityManager.getTransaction().commit();
    }
}
