package com.sungwon.library.app.dto.library;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class BookListDTO {
    //책 제목
    private String title;
    //책 저자
    private String author;
    //출판일
    private LocalDate publication_date;
    //금액
    private int price;
    //장르
    private String genre;
    //설명
    private String description;
}
