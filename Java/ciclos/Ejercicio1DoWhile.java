package ciclos;

import javax.swing.JOptionPane;

public class Ejercicio1DoWhile {
	/*
	 * Algoritmo que imprima la suma de los 10 primeros numeros
	 * usando el ciclo do-while
	 */
	public static void main(String[] args) {
		
		int i=0, suma=0, cant=0;
		
		cant=Integer.parseInt(JOptionPane.
				showInputDialog("Ingrese la cantidad"));
		
		do {
			suma=suma+i;
			
			i++;
		} while (i<=cant);
			
		
		System.out.println("La suma de los "+cant+" primeros numeros es: "+suma);
		//0+1+2+3 = 6 

	}

}
