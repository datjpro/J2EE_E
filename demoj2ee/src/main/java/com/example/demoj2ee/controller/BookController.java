package com.example.demoj2ee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demoj2ee.model.Book;
import com.example.demoj2ee.service.BookService;
import java.util.List;
import jakarta.websocket.server.PathParam;

import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/api/books")

public class BookController {
    @Autowired
    private BookService bookService;;

    @GetMapping
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    @GetMapping("/{id}")
    public Book getBookById(@PathVariable int id) {
        return bookService.getBookById(id);
    }

    // thêm sách mới
    @PostMapping
    public String addBook(@RequestBody Book book) {
        bookService.addBook(book);
        return "Book added successfully";
    }

    // cập nhập thông tin sách
    @PutMapping("/{id}")
    public String updateBook(@PathVariable int id, @RequestBody Book updateBook) {
        bookService.updateBook(id, updateBook);
        return "Book updated successfully";
    }

    // xóa sách theo id
    @DeleteMapping("/{id}")
    public String deleteBook(@PathVariable int id) {
        bookService.deleteBook(id);
        return "Book deleted successfully";
    }
}
