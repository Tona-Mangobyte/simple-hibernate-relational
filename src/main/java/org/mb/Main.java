package org.mb;

import org.mb.service.BookService;

public class Main {
    public static void main(String[] args) {
        try {
            BookService bookService = new BookService();
            bookService.create();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}

