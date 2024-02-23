package com.sungwon.library.base.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
public class ResultDTO<T> {
        // 처리 결과에 대한 성공 또는 실패 여부를 나타내는 코드
        private int resultCode;

        // 처리 결과에 대한 메시지
        private String message;

        // 처리된 데이터
        private T data;

        ResultDTO(int resultCode, String message, T data){
                this.resultCode = 1;
                this.message ="SUCESS";
                this.data = data;
        }
}
