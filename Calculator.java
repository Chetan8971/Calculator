package javaproject;


public class Calculator {

	public void add(int a, int b)
	{
		System.out.println(a+b);
	}
	public void sub(int a, int b)
	{
		System.out.println(a*b);
	}
	public void div(int a, int b)
	{
		System.out.println(a%b);

	}
	public static void main(String[] args) {

		Calculator a=new Calculator();
		a.add(10, 20);
		a.sub(20,30);
		a.div(20, 50);
		System.out.println("hai hello");
	}
}



