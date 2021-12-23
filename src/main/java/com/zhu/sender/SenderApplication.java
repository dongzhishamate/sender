package com.zhu.sender;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zhu.sender.mapper")
public class SenderApplication {
  public static void main(String[] args) {
    SpringApplication.run(SenderApplication.class, args);
  }
}
