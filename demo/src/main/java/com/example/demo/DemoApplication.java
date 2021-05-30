package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.core.task.TaskExecutor;
import org.springframework.scheduling.TaskScheduler;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

//	@Bean
//    public TaskExecutor threadPoolTaskExecutor() {
//        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
//        executor.setCorePoolSize(4);
//        executor.setMaxPoolSize(4);
//        executor.setThreadNamePrefix("default_task_executor_thread");
//        executor.initialize();
//        return executor;
//    }
	
//	 @Bean
//	  public TaskExecutor taskExecutor() {
//	    return new ThreadPoolConfig(300,500,1000)
//	        .taskExecutor();
//	  }

	  @Bean
	  public TaskScheduler taskScheduler() {
		  System.out.println("coming here");
	    return new ThreadPoolConfig(3,2,2)
	        .taskScheduler();
	  }
}
