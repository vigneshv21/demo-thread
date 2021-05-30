package com.example.demo;

import org.springframework.scheduling.TaskScheduler;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;

public class ThreadPoolConfig {

  private final int corePoolSize;
  private final int maxPoolSize;
  private final int queueCapacity;

  public ThreadPoolConfig(final int corePoolSize, final int maxPoolSize, final int queueCapacity) {
    this.corePoolSize = corePoolSize;
    this.maxPoolSize = maxPoolSize;
    this.queueCapacity = queueCapacity;
  }

//  public ThreadPoolTaskExecutor taskExecutor() {
//    final ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
//    executor.setCorePoolSize(this.corePoolSize);
//    executor.setMaxPoolSize(this.maxPoolSize);
//    executor.setQueueCapacity(this.queueCapacity);
//    executor.setWaitForTasksToCompleteOnShutdown(true);
//    return executor;
//  }

  public TaskScheduler taskScheduler() {
    final ThreadPoolTaskScheduler taskScheduler = new ThreadPoolTaskScheduler();
    taskScheduler.setWaitForTasksToCompleteOnShutdown(true);
    taskScheduler.setPoolSize(this.corePoolSize);
//    taskScheduler.setThreadNamePrefix("sdfsd");
    return taskScheduler;
  }

}
