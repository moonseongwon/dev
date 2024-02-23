package com.sungwon.library.app.mapper;

import com.sungwon.library.app.dto.library.BookListDTO;
import com.sungwon.library.app.dto.library.SearchDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface LibraryMapper {
    List<BookListDTO> getBookList(SearchDTO searchDTO);
}
