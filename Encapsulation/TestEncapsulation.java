package com.tns.encapsulation;

public class TestEncapsulation {

	public static void main(String[] args) {
		Account obj = new Account();
		obj.setAcc_no(12345678);
		obj.setName("harshad");
		obj.setEmail("harshad@gmail.com");
		obj.setAmount(123455.67f);
		
		System.out.println("the account No. is "+obj.getAcc_no()+" name is "+obj.getName()+" email is "+obj.getEmail()+" and amount is "+obj.getAmount());
		

	}

}
