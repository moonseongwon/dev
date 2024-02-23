package com.sungwon.library.app.dto.library;


import com.sungwon.library.base.dto.PagingDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class SearchDTO extends PagingDTO {
    // 검색어
    private String searchKeyword;

    // 검색 유형
    private String searchType;

    // 정렬 기준
    private String category;
    
    //제목
    private String title;

    //저자
    private String author;

    //책 대출 여부
    private String rent_yn;
}
