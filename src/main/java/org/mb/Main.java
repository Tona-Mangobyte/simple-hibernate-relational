package org.mb;

import org.mb.service.BookService;
import org.mb.service.OrderService;

public class Main {
    public static void main(String[] args) {
        try {
            /*BookService bookService = new BookService();
            bookService.create();*/
            OrderService orderService = new OrderService();
            orderService.create();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}

