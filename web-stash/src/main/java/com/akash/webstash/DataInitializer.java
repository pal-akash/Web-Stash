/*

package com.akash.webstash;

import com.akash.webstash.model.Bookmark;
import com.akash.webstash.repository.BookmarkRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.Instant;

@Component
@RequiredArgsConstructor
public class DataInitializer implements CommandLineRunner {

    private final BookmarkRepository bookmarkRepository;

    @Override
    public void run(String... args) throws Exception {
        bookmarkRepository.save(new Bookmark(null, "SpringBlog", "https://spring.io/blog", Instant.now()));
        bookmarkRepository.save(new Bookmark(null, "Quarkus", "https://quarkus.io/", Instant.now()));
        bookmarkRepository.save(new Bookmark(null, "DZone", "https://dzone.com/", Instant.now()));
        bookmarkRepository.save(new Bookmark(null, "baeldung", "https://www.baeldung.com", Instant.now()));
    }
}

 */
