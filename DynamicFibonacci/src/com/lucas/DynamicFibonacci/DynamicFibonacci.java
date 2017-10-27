package com.lucas.DynamicFibonacci;

import javax.swing.JOptionPane;

public class DynamicFibonacci
{
	private int computeFib;
	private int computeCount;
	private long computeValue;
	private long computeTable[];
	
	public DynamicFibonacci()
	{
		try
		{
			String computeString = JOptionPane.showInputDialog(null, "Qual o valor de N?", "DynamicFibonacci", JOptionPane.QUESTION_MESSAGE);
			
			if (computeString == null)
			{
				System.exit(1);
			}
			
			computeFib = Integer.parseInt(computeString);
			
			if (computeFib < 0)
			{
				throw new NumberFormatException();
			}
		}
		catch (NumberFormatException e)
		{
			JOptionPane.showMessageDialog(null, "Formato e/ou número inválido!", "Erro", JOptionPane.ERROR_MESSAGE);

			System.exit(-1);
		}
	}

	public void Init()
	{
		computeTable = new long[computeFib + 1];

		for (int i = 0; i < computeTable.length; i++)
		{
			computeTable[i] = -1;
		}
	}
	
	public long Compute(int n)
	{
		computeCount++;

		if (computeTable[n] == -1)
		{
			if (n <= 1)
			{
				computeTable[n] = n;
			}
			else
			{
				computeTable[n] = Compute(n-1) + Compute(n-2);
			}
	    }

		return computeValue = computeTable[n];
	}
	
	public void Display()
	{
		JOptionPane.showMessageDialog
		(
			null,
			String.format
			(
				"Fib(%d): %d%sIterações: %d",
				computeFib,
				computeValue,
				System.lineSeparator(),
				computeCount
			),
			"Resultado", JOptionPane.INFORMATION_MESSAGE
		);
	}
	
	public int getComputeFib()
	{
		return computeFib;
	}
}
