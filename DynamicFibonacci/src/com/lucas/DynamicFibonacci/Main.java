/*
 * Main.java
 * Author: Lucas Cota
 * Description: Classe principal para o cálculo do Fibonacci dinâmico.
 * Date: 2017-10-27
 * Modified: 2017-10-27
 */

package com.lucas.DynamicFibonacci;

import javax.swing.JOptionPane;

public class Main
{
	public static void main(String[] args)
	{
		DynamicFibonacci dynamicFibonacci = new DynamicFibonacci();
		
		// Inicia a tabela de computações
		dynamicFibonacci.Init();
		
		try
		{
			// Computa o Fib(n)
			dynamicFibonacci.Compute(dynamicFibonacci.getComputeFib());
		}

		// Verifica se o heap da JVM foi estourado
		catch (StackOverflowError e)
		{
			JOptionPane.showMessageDialog(null, "A memória da JVM estourou, tente números menores.", "Erro", JOptionPane.ERROR_MESSAGE);

			System.exit(1);
		}
		
		// Exibe os resultados
		dynamicFibonacci.Display();
	}
}
