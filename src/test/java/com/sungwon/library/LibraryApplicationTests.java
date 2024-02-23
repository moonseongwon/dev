package com.sungwon.library;

import com.sungwon.library.app.mapper.TestMapper;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Log4j2
@SpringBootTest
class LibraryApplicationTests {
	@Autowired
	//객체들은 직접적으로 다른 객체를 생성하거나 참조하지 않고도 필요한 객체를 가져와 사용,
	TestMapper testMapper;

	@Test
	void Test(){
		log.info("###################################START#################################");
		int temp = testMapper.Test();
		log.info(temp);
		log.info("###################################END#################################");
	}

}
