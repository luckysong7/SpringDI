package com.exe.springdi2;

public class MessageCall {

	public static void main(String[] args) {

		
		// 1.
		System.out.println("1. �Ϲ����� ��ü���� \n");
		MessageEn ob1 = new MessageEn();
		ob1.sayHello("JAEHOON");
		
		MessageKr ob2 = new MessageKr();
		ob2.sayHello("����");
		System.out.println();
		// 2.
		System.out.println("2. �������̽� ��ü���� \n");
		Message ms =null;
		ms = new MessageEn();
		ms.sayHello("�ں���");
		
		ms = new MessageKr();
		ms.sayHello("�ں���");
		
		
	}

}
