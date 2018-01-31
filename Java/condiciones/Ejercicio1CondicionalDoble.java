package condiciones;

import javax.swing.JOptionPane;

public class Ejercicio1CondicionalDoble {
	/*
	 * Cree un algoritmo que lea dos números reales y determine cuál 
	 * de ellos es el mayor
	 */
	public static void main(String[] args) {
		int num1,num2;
		
		num1=Integer.parseInt(JOptionPane.
				showInputDialog("Ingrese el numero 1"));
		System.out.println("num1= "+num1);
		num2=Integer.parseInt(JOptionPane.
				showInputDialog("Ingrese el numero 2"));
		System.out.println("num2= "+num2);
		
		if(num1>num2){
			System.out.println("El numero 1 es Mayor");
		}else{
			System.out.println("El numero 2 es Mayor");
		}
	}

}
