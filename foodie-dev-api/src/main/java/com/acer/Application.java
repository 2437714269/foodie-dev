package com.acer;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author acer
 */
@SpringBootApplication
@MapperScan(basePackages = {"com.acer.mapper"})
public class Application {

	public static void main(String[] args){
		SpringApplication.run(Application.class,args);
	}
}
