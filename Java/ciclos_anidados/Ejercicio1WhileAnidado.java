package ciclos_anidados;

import javax.swing.JOptionPane;

public class Ejercicio1WhileAnidado {
	/*
	 * Algoritmo que imprima la suma de los 10 primeros numeros
	 * usando el ciclo while, repita el proceso hasta
	 * que el usuario decida
	 */
	public static void main(String[] args) {
		
		int i, suma, cant=0;
		String resp="";
		
			
		do {
			//
			cant=Integer.parseInt(JOptionPane.
					showInputDialog("Ingrese la cantidad"));
			i=0;
			suma=0;
			while (i<=cant) {
				suma=suma+i;
				
				i++;
			} 
			System.out.println("La suma de los "+cant+" primeros numeros es: "+suma);
			//0+1+2+3 = 6 
			//			
			resp=JOptionPane.showInputDialog("Ingres si, si desea continuar");
		} while (resp.equalsIgnoreCase("si"));
		
		

	}

}
