package com.example.demo;

import java.time.Instant;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.TaskScheduler;
import org.springframework.stereotype.Component;

@Component
public class ThreadExecution {

	@Autowired
	private TaskScheduler taskScheduler;

////	@PostConstruct
//	public void startThread()
//	{
//		
//	}

	@PostConstruct
	public void initialize() {
		// since this runs in every node, only master node should build cache
		Runnable task1 = () -> {
			try {
				System.out.println(Thread.currentThread().getName());
				Thread.sleep(2000);
				System.out.println("hello1");

			} catch (Exception e) {

			}
		};
		Runnable task2 = () -> {
			try {
				System.out.println(Thread.currentThread().getName());
				Thread.sleep(2000);
				System.out.println("hello2");

			} catch (Exception e) {

			}
		};
		Runnable task3 = () -> {
			try {
				System.out.println(Thread.currentThread().getName());
				Thread.sleep(2000);
				System.out.println("hello3");

			} catch (Exception e) {

			}
		};

		taskScheduler.schedule(task1, Instant.ofEpochMilli(System.currentTimeMillis() + 10000));
		taskScheduler.schedule(task2, Instant.ofEpochMilli(System.currentTimeMillis() + 10000));
		taskScheduler.schedule(task3, Instant.ofEpochMilli(System.currentTimeMillis() + 10000));
		System.out.println("first came here ");
		
		String d="http://uniphore.orekacr.com:59120";
		List<String> g=Arrays.asList(d.split(","));
		System.out.println(g+"ksafdkn");

	}
//	ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
//
//	executorService.schedule();
}
