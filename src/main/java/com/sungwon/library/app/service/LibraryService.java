package com.sungwon.library.app.service;

import com.sungwon.library.app.dto.library.BookListDTO;
import com.sungwon.library.app.dto.library.SearchDTO;

import java.util.List;

public interface LibraryService {

    /**
     * @author      : 문성원
     * @since       : 2024/02/21
     * description  : 도서목록 조회 API
     */
    List<BookListDTO> getBookList(SearchDTO searchDTO);
}
