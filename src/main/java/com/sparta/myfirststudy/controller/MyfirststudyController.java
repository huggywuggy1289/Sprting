package com.sparta.myfirststudy.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

@Controller
public class MyfirststudyController {

    private static final Logger logger = LoggerFactory.getLogger(MyfirststudyController.class);

    @GetMapping("/helloworld")
    public String Myfirststudy(Locale locale, Model model) {
        logger.info("Welcome home! The client locale is {}.", locale);

        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
        String formattedDate = dateFormat.format(date);

        // model 객체에 서버 시간을 추가
        model.addAttribute("serverTime", formattedDate);

        // 뷰 파일 이름을 반환 (리디렉션 대신)
        return "myfirststudy"; // templates/myfirststudy.html 파일을 가리킴
    }
}
// ./gradlew build -x test
// docker build -t my:25.0.3 . >> 이부분에서 에러떳음.
// docker info
// 다시  docker build -t my:25.0.3 .

