package com.bj.habit.controller;

import java.util.UUID;

import org.testng.annotations.Test;

public class ImageTest {

	@Test
	public void testUUID(){
		String str = UUID.randomUUID().toString();
		System.out.println(str);
	}
}
