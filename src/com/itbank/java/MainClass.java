package com.itbank.java; // . : 하위
//패키지 = 폴더

//다른 패키지에 있는 값은 import 해서 불러온다.
import com.itbank.kim.TestClass01;
import com.itbank.kim.TestClass02;

public class MainClass {
	public static void main(String[] args) {
		TestClass t = new TestClass();
		t.test();
		com.itbank.kim.TestClass t01 = new com.itbank.kim.TestClass();
		t01.test();
		
		TestClass01 tt01 = new TestClass01();
		tt01.test01();
		TestClass02 tt02 = new TestClass02();
		
		
	}
}
