package io.github.eutkin.monolith.first.service.repository;

import io.github.eutkin.monolith.first.service.model.Book;

import java.util.List;

public interface BookRepository {
    List<Book> findAll();
}
