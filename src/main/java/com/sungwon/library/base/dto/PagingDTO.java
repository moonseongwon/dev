package com.sungwon.library.base.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder // 상속된 클래스의 필드까지 빌더 패턴을 통해 객체를 생성, @Builder 상속 X
public class PagingDTO {
    //객체) 클래스의 필드를 private으로 선언하는 것은 객체지향 프로그래밍의 캡슐화(encapsulation) 원칙을 따르기 위한 것

    //화면 표시되는 숫자
    private int recordSize;

    //현재 페이지
    private int page;

    //페이지 나타는 데이터 갯수
    private int total;
}