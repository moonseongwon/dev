package com.sungwon.library.app.service.impl;

import com.sungwon.library.app.mapper.TestMapper;
import com.sungwon.library.app.service.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor //클래스의 final 필드나 @NonNull 어노테이션이 붙은 필드를 가지고 생성자를 자동으로 생성합니다.
@Service  //Spring 컨테이너는 해당 클래스를 빈(Bean)으로 등록하고, 애플리케이션에서 필요한 곳에서 이 빈을 주입받아 사용
public class TestServiceImpl implements TestService {

    //final 키워드를 사용하면 해당 변수는 초기화된 이후에는 변경할 수 없으므로 더 안정적이고 예측 가능한 코드를 작성
    private final TestMapper testMapper;


    //메소드를 오버라이드할 때는 접근제어자를 좁힐 수 없음
    @Override
    public int Test(){
        return testMapper.Test();
    }
}
