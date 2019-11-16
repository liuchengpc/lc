package com.accp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.accp.mapper")
public class Java1SpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(Java1SpringbootApplication.class, args);
	}

}
