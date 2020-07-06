package io.github.eutkin.monolith.first.service.controller;

import io.github.eutkin.monolith.first.service.api.BookFacade;
import io.github.eutkin.monolith.first.service.model.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/book")
public class BookRestController {

    private final BookFacade bookFacade;

    public BookRestController(BookFacade bookFacade) {
        this.bookFacade = bookFacade;
    }

    @GetMapping
    public List<Book> getAll() {
        return this.bookFacade.getAll();
    }
}
