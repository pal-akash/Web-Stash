package com.akash.webstash.dto;

import com.akash.webstash.model.Bookmark;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.domain.Page;

import java.util.List;

@Setter
@Getter
public class BookmarkDTO {
    private List<Bookmark> data;
    private Long totalElements;
    private Integer totalPages;
    private Integer currentPage;

    @JsonProperty("isFirst")
    private Boolean isFirst;

    @JsonProperty("isLast")
    private Boolean isLast;

    private Boolean hasNext;
    private Boolean hasPrevious;

    public BookmarkDTO(Page<Bookmark> bookmarkPage){
        this.setData(bookmarkPage.getContent());
        this.setTotalElements(bookmarkPage.getTotalElements());
        this.setTotalPages(bookmarkPage.getTotalPages());
        this.setCurrentPage(bookmarkPage.getNumber() + 1);
        this.setIsFirst(bookmarkPage.isFirst());
        this.setIsLast(bookmarkPage.isLast());
        this.setHasNext(bookmarkPage.hasNext());
        this.setHasPrevious(bookmarkPage.hasPrevious());
    }
}
