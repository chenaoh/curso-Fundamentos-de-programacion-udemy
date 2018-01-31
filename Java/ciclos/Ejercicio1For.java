package ciclos;

import javax.swing.JOptionPane;

public class Ejercicio1For {
	/*
	 * Algoritmo que imprima la suma de los 10 primeros numeros
	 * usando el ciclo for
	 */
	public static void main(String[] args) {
		
		int i, suma=0, cant=0;
		
		cant=Integer.parseInt(JOptionPane.
				showInputDialog("Ingrese la cantidad"));
		
		for ( i = 0; i <=cant; i++) {
			suma=suma+i;
		}
		
		
		System.out.println("La suma de los "+cant+" primeros numeros es: "+suma);
		//0+1+2+3 = 6 

	}

}
