package com.lucas.DynamicFibonacci;

public class Main
{
	public static void main(String[] args)
	{
		DynamicFibonacci dynamicFibonacci = new DynamicFibonacci();
		
		dynamicFibonacci.Init();
		
		try
		{
			dynamicFibonacci.Display();
		}
		catch (StackOverflowError e)
		{
			System.out.println("Estourou!");
		}
	}
}
