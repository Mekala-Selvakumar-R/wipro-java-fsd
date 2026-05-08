package com.demo.day9;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableDemo {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService service = Executors.newSingleThreadExecutor();

		Callable<Integer> task = () -> 10 + 20;

		Future<Integer> result = service.submit(task);
		System.out.println(result.get()); // 30

		service.shutdown();

	}

}
