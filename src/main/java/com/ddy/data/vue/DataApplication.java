package com.ddy.data.vue;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

//@EnableTransactionManagement  //开启事务管理
//http://localhost:8950/swagger-ui.html
@SpringBootApplication
@EnableScheduling // 这里，启用定时任务
//@ComponentScan("com.ddy.data.vue.Configuration")
public class DataApplication {
	public static void main(String[] args) {
		SpringApplication.run(DataApplication.class, args);
	}
}
