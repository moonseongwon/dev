package com.sungwon.library.app.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper  //인터페이스를 매퍼로 선언, 인터페이스 메서드와 SQL 매핑, 동적 SQL 작성,SQL 매개변수 매핑, 결과 매핑 SQL
public interface TestMapper {
    int Test();
}
