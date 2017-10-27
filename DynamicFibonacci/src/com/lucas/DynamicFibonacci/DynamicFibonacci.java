/*
 * DynamicFibonacci.java
 * Author: Lucas Cota
 * Description: Calcula o Fibonacci utilizando a programação dinâmica de Top Down Memoization.
 * Reference: <https://en.wikipedia.org/wiki/Memoization>
 * Date: 2017-10-27
 * Modified: 2017-10-27
 */

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
		// Recebe o valor de N e verifica se o número é negativo
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
		// Inicia a array de valores computados de acordo com o tamanho de N
		computeTable = new long[computeFib + 1];

		// Inicia toda a estrutura com -1
		for (int i = 0; i < computeTable.length; i++)
		{
			computeTable[i] = -1;
		}
	}
	
	public long Compute(int n)
	{
		// Contador de iterações
		computeCount++;
		
		// Lógica parecida com o original, mas esta possui uma tabela que é verificada antes de chamar a função recursiva de acordo com o valor de N
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
