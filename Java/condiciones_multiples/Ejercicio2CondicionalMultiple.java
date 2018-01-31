package condiciones_multiples;

import javax.swing.JOptionPane;

public class Ejercicio2CondicionalMultiple {
	/*
	 * Algoritmo que solicite un codigo y basado en este
	 * imprima el dia correspondiente
	 * 
	 *  1. Lunes - 2. martes - 3. Miercoles
	 *  4. Jueves - 5. Viernes - 6. Sabado - 7. Domingo  
	 */
	
	public static void main(String[] args) {
		int codigo=0;
		String mensaje="MENU\n\n";
		
		mensaje+="1. Lunes\n";
		mensaje+="2. Martes\n";
		mensaje+="3. Miercoles\n";
		mensaje+="4. Jueves\n";
		mensaje+="5. Viernes\n";
		mensaje+="6. Sabado\n";
		mensaje+="7. Domingo\n";
		
		codigo=Integer.parseInt(JOptionPane.
				showInputDialog(mensaje+"\n Ingrese el codigo"));
		
		switch (codigo) {
		case 1: System.out.println("El dia es Lunes");			
			break;
		case 2: System.out.println("El dia es Martes");			
			break;
		case 3: System.out.println("El dia es Miercoles");			
			break;
		case 4: System.out.println("El dia es Jueves");			
			break;
		case 5: System.out.println("El dia es Viernes");			
			break;
		case 6: System.out.println("El dia es Sabado");			
			break;
		case 7: System.out.println("El dia es Domingo");			
			break;

		default: System.out.println("El codigo no existe!!!");
			break;
		}
		
		
		
		
		
		
		
		
	}

}
