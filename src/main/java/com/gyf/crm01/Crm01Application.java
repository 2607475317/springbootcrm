package com.gyf.crm01;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.gyf.crm01"})
@MapperScan(basePackages={"com.gyf.crm01.mapper"})//扫描Mapper
public class Crm01Application {

	public static void main(String[] args) {
		SpringApplication.run(Crm01Application.class, args);
	}

}
