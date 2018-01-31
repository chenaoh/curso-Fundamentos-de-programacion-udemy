package condiciones;

import javax.swing.JOptionPane;

public class Ejercicio2CondicionalSimple {
	/*
	 * Algoritmo que solicite un numero, si este es negativo 
	 * entonces lo convierta en positivo
	 */
	public static void main(String[] args) {
		int num=0;
		
		num=Integer.parseInt(JOptionPane.
				showInputDialog("Ingrese el numero"));
		
		if(num<0){
			System.out.println("El numero es negativo!");
			num=num*-1;
		}
		
		System.out.println("El numero ingresado es: "+num);
		
	}

}
