package com.lucas.DynamicFibonacci;

import javax.swing.JOptionPane;

public class Main
{
	public static void main(String[] args)
	{
		DynamicFibonacci dynamicFibonacci = new DynamicFibonacci();
		
		dynamicFibonacci.Init();
		
		try
		{
			dynamicFibonacci.Compute(dynamicFibonacci.getComputeFib());
		}
		catch (StackOverflowError e)
		{
			JOptionPane.showMessageDialog(null, "A memória da JVM estourou, tente números menores.", "Erro", JOptionPane.ERROR_MESSAGE);

			System.exit(1);
		}
		
		dynamicFibonacci.Display();
	}
}
