package com.mingdyuo.book.springboot;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // 얘가 스프링 부트 자동 설정 해줌, 최상단에 써야함
public class Application { // 프로젝트의 메인 클래스
    public static void main(String[] args){
        // 내장 WAS(Web Application Server)를 실행
        // 톰캣 항상 서버에 설치할 필요 없어짐. Jar로 실행하면 됨
        SpringApplication.run(Application.class, args);
    }
}
