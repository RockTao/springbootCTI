package com.imooc;

//import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
//扫描mybatis  mapper包路径
@MapperScan(basePackages="com.imooc.mapper")
//扫描所需要的包，包含一些自用的工具类包所在的路劲
@ComponentScan(basePackages= {"com.imooc","org.n3r.idworker"})
//开启定时任务
@EnableScheduling 
//异步调用方法
@EnableAsync
public class ImoocApplication {

	public static void main(String[] args) {
		SpringApplication.run(ImoocApplication.class, args);
	}
}
