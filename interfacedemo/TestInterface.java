package com.tns.interfacedemo;

class SBI implements Bank{
	public float RateOfInterest() {
		return 9.15f;
	}
}
class BOI implements Bank{
	public float RateOfInterest() {
		return 7.5f; 
	}
}
public class TestInterface {

	public static void main(String[] args) {
		SBI s=new SBI();
		System.out.println("Rate of Interest of SBI is "+s.RateOfInterest());
		BOI b=new BOI();
		System.out.println("Rate of Interest of BOI is "+b.RateOfInterest());
		
	}

}
