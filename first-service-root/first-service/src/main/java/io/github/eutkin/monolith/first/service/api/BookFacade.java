package io.github.eutkin.monolith.first.service.api;

import io.github.eutkin.monolith.first.service.model.Book;

import java.util.List;

public interface BookFacade {

    List<Book> getAll();
}
