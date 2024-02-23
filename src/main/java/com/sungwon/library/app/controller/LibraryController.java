package com.sungwon.library.app.controller;

import com.sungwon.library.app.dto.library.BookListDTO;
import com.sungwon.library.app.dto.library.SearchDTO;
import com.sungwon.library.app.service.LibraryService;
import com.sungwon.library.base.dto.ResultDTO;
import com.sungwon.library.app.constatnt.CommonConstatnts;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController  //RESTful 웹 서비스의 엔드포인트를 처리하는 컨트롤러임을 나타냅
@RequiredArgsConstructor
@RequestMapping("/api/book")
public class LibraryController {
    private final LibraryService libraryService;

    /**
     * autor : 문성원
     * since : 2024.02.23
     * @param searchDTO
     * @return bookListDTO, String
     * description : 대여 책 리스트 조회
     */
   @GetMapping("/getbook")
    public ResultDTO<List<BookListDTO>> searchBook(SearchDTO searchDTO){
        List<BookListDTO> bookListDTO = libraryService.getBookList(searchDTO);
        return ResultDTO.<List<BookListDTO>>builder().data(bookListDTO).message(CommonConstatnts.SUCCESS).resultCode(1).build();
    }
}
