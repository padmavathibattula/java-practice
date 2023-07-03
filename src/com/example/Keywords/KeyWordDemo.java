package com.example.keywords;

public class KeyWordDemo {
	public static void main(String[] args) {// it is call by jvm(jvm call with class name)
		StaticExample obj = new StaticExample();
		System.out.println(obj.name);// here name variable non static so we called with object
		StaticExample.run();// here run method is static so we called with object
		// so static variable or methods not at object level but it is at class level
		// so non static variable or methods at an object level but it is not at class
		// level
		// FinalExample obj=new FinalExample();
		// FinalExample.name="padma";
		System.out.println(Constants.NAME);
		System.out.println(Math.PI);

	}

}
