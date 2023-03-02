package com.Sk;

public class Abs extends Valu1 {

	@Override
	public void AtmPin() {
		System.out.println("1523");
	}

	@Override
	public void Atm_Bank() {
System.out.println("HDFC");		
	}

	public static void main(String[] args) {
		
		Abs a = new Abs();
		a.Atm_Bank();
		a.AtmPin();
	}
}
