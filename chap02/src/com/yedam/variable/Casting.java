package com.yedam.variable;

public class Casting {
	public static void main(String[] args) {
		//자동타입변환 작은걸 큰거에 넣을 때
		byte byteValue = 10;
		int intValue = byteValue;
		
		System.out.println("intValue:"+intValue);
		
		char charValue = '가';
		intValue = charValue;
		System.out.println("가의 유니코드:" + intValue);
		
		intValue = 50;
		long longValue = intValue;
		System.out.println("longValue:" + longValue);
		
		double doubleValue = longValue;
		System.out.println("doubleValue:"+ doubleValue);
		
		//강제 타입 변환
		//작은 혀용 범위 타입 = (작은 혀용 범위 타입)큰 범위 타입
		
		int intVar = 127;
		byte byteVar = (byte)intVar;
		
		System.out.println("byteVar:"+byteVar);
		
		int intVar2 = 44032;
		char charVar = (char)intVar2;
		
		System.out.println("charVar:"+ charVar);
		
		//실수 <-> 정수간 강제 타입 변환
		//자동타입변환 : int -> double = 3.0
		//강제타입변환 : double -> int = 소수점 땐 정수만 타입 변환
		double doubleVar = 3.14;
		intVar2 = (int)doubleVar;
		System.out.println("intVar2"+intVar2);
	}
}
