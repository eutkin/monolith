package io.github.eutkin.monolith.first.service.facade;

import io.github.eutkin.monolith.first.service.api.BookFacade;
import io.github.eutkin.monolith.first.service.model.Book;
import io.github.eutkin.monolith.first.service.repository.BookRepository;

import java.util.List;

public class DefaultBookFacade implements BookFacade {

    private final BookRepository bookRepository;

    public DefaultBookFacade(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public List<Book> getAll() {
        return this.bookRepository.findAll();
    }
}
