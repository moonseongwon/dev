package com.sungwon.library.app.service.impl;

import com.sungwon.library.app.dto.library.BookListDTO;
import com.sungwon.library.app.dto.library.SearchDTO;
import com.sungwon.library.app.mapper.LibraryMapper;
import com.sungwon.library.app.service.LibraryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class LibraryServiceImpl implements LibraryService {
    private final LibraryMapper libraryMapper;

    @Override
    public List<BookListDTO> getBookList(SearchDTO searchDTO){
        List<BookListDTO> bookListDTO = libraryMapper.getBookList(searchDTO);
        return bookListDTO;
    }
}
