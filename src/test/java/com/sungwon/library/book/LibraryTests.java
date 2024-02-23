package com.sungwon.library.book;

import com.sungwon.library.app.dto.library.BookListDTO;
import com.sungwon.library.app.dto.library.SearchDTO;
import com.sungwon.library.app.mapper.LibraryMapper;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
@Log4j2
public class LibraryTests {

    @Autowired
    LibraryMapper libraryMapper;

    @Test
    void BookSearch(){
        SearchDTO searchDTO = SearchDTO.builder()
                .page(1)
                .recordSize(10)
                .searchKeyword("")
                .searchType("")
                .category("title")
                .title("")
                .author("")
                .rent_yn("N")
                .build();
        log.info(searchDTO);
        log.info("############################BookSearch() Start ##################################");
        List<BookListDTO> dto;
        dto = libraryMapper.getBookList(searchDTO);
        log.info("==>",dto);
        log.info("############################BookSearch() End ##################################");
    }

}
