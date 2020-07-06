package io.github.eutkin.monolith.first.service;

import io.github.eutkin.monolith.first.service.api.BookFacade;
import io.github.eutkin.monolith.first.service.facade.DefaultBookFacade;
import io.github.eutkin.monolith.first.service.model.Book;
import io.github.eutkin.monolith.first.service.repository.BookRepository;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;


import java.util.List;

import static java.util.Arrays.asList;

@SpringBootConfiguration
@ComponentScan("io.github.eutkin.monolith.first.service")
public class FirstServiceAutoConfiguration {

    @Bean
    BookFacade bookFacade(BookRepository bookRepository) {
        return new DefaultBookFacade(bookRepository);
    }

    @Bean
    BookRepository bookRepository() {
        return new BookRepository() {
            @Override
            public List<Book> findAll() {
                return asList(new Book("Bible"), new Book("Idiot"));
            }
        };
    }
}
