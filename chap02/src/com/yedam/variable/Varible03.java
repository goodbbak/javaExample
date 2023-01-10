package com.yedam.variable;

public class Varible03 {
	public static void main(String[] args) {
		
		int var1 = 0b1011; //2진수
		int var2 = 0206; //8wlstn
		int var3 = 365;	//10진수
		int var4 = 0xB3; //16진수
				
		System.out.println("var1 :"+var1);
		System.out.println("var2 :"+var2);
		System.out.println("var3 :"+var3);
		System.out.println("var4 :"+var4);
		
		byte bVar1 = 125;
		//byte bVar2 = 200; //byte는 -128 ~ 127
		
		System.out.println("bVar1 :"+bVar1);
		//System.out.println("bVar2 :"+bVar2);
	
		//long
		long lVar1 = 2000000;
		long lVar2 = 20000000000L; //int 범위 넘어가면 끝에 L
		
		//Char
		char c1 = 'A';
		char c2 = 65;
		char c3 = '\u0041';
		
		char c4 = '가';
		char c5 = 44032;
		char c6 = '\uac00';
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);
		
		
				
				
		
	}
}
