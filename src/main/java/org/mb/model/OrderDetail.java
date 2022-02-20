package org.mb.model;

import javax.persistence.*;

@Entity
@Table(name = "order_details")
public class OrderDetail implements java.io.Serializable {
    private long id;
    private Long qty;
    private Double price;
    private Double amount;

    private Book book;
    private Order order;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Column(name = "qty", nullable = false)
    public Long getQty() {
        return qty;
    }

    public void setQty(Long qty) {
        this.qty = qty;
    }

    @Column(name = "price", nullable = false)
    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Column(name = "amount", nullable = false)
    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @ManyToOne
    @JoinColumn(name="book_id", nullable=false)
    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    @ManyToOne
    @JoinColumn(name="order_id", nullable=false)
    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}
