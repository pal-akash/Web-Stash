package com.akash.webstash.mapper;

import com.akash.webstash.dto.BookmarkDTO;
import com.akash.webstash.model.Bookmark;
import org.springframework.stereotype.Component;

@Component
public class BookmarkMapper {

    public BookmarkDTO toDTO(Bookmark bookmark){
        return new BookmarkDTO(
                bookmark.getId(),
                bookmark.getTitle(),
                bookmark.getUrl(),
                bookmark.getCreatedAt()
                );
    }
}
