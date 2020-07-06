package io.github.eutkin.monolith;

import io.github.eutkin.monolith.first.service.api.BookFacade;
import io.github.eutkin.monolith.first.service.model.Book;
import org.springframework.stereotype.Service;

@Service
public class SomeMonolithService {

    private final BookFacade bookFacade;

    public SomeMonolithService(BookFacade bookFacade) {
        this.bookFacade = bookFacade;
    }

    public void doSomething() {
        bookFacade.getAll()
                .stream()
                .map(Book::getName)
                .forEach(System.out::println);
    }

}
