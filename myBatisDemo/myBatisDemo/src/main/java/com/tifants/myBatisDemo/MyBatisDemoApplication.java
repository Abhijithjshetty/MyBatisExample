package com.tifants.myBatisDemo;

import com.tifants.myBatisDemo.model.Users;
import org.apache.ibatis.type.MappedTypes;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MappedTypes(Users.class)
@MapperScan("com.tifants.myBatisDemo.mapper")
@SpringBootApplication
public class MyBatisDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyBatisDemoApplication.class, args);
	}

}
