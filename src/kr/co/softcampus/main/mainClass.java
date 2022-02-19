package kr.co.softcampus.main;

import kr.co.softcampus.beans.HelloWorldEn;
import kr.co.softcampus.beans.HelloWorldKo;


public class mainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		//HelloWorldEn hello1 =  new HelloWorldEn();
		HelloWorldKo hello1 =  new HelloWorldKo();
		callMethod(hello1);
		
		HelloWorldEn hello2 =  new HelloWorldEn();
		callMethod(hello2);
	}
	
	public static void callMethod(HelloWorldEn hello) {
		hello.sayHello();
	}
	
	public static void callMethod(HelloWorldKo hello) {
		hello.sayHello();
	}

}
