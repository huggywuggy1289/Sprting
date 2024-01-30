package com.sparta.springprepare;

import lombok.Getter;
import lombok.Setter;

@Getter //이 에너테이션을 통해 아래 클래스에 선언한 필드에 대한 get메서드를 memo.class에 보여준다.
@Setter //이것도 마찬가지
public class Memo {
    private String username;
    private String contents;
}
