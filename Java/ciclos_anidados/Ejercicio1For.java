package ciclos_anidados;

import javax.swing.JOptionPane;

public class Ejercicio1For {
	/*
	 * Algoritmo que imprima las tablas de multiplicar
	 * la cantidad de tablas son determinadas por el usuario
	 * así como la cantidad de numeros a multiplicar
	 */
	public static void main(String[] args) {
		
		int cant=Integer.parseInt(JOptionPane.
				showInputDialog("Ingrese la cantidad de tablas"));
		
		for (int j = 1; j <= cant; j++) 
		{
			for (int i = 1; i <=10 ; i++) 
			{
				System.out.println(i+"*"+j+" = "+(i*j));
			}
			System.out.println("**************************");
		}
		
		
		
	}

}
