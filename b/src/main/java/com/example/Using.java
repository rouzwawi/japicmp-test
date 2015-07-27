package com.example;

public class Using {

	public static void main(String[] args) {
		System.out.println("hello " + new MyFuture());
	}

	static class MyFuture extends SpecialFuture {
	}
}