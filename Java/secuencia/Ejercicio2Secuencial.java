package secuencia;
import javax.swing.JOptionPane;

public class Ejercicio2Secuencial {
	/*
	 * algoritmo que reciba como entrada el sueldo de una persona
	 * y sus horas extras trabajadas y luego imprima el Sueldo 
	 * total de esta persona dado que cada hora extra vale $3000.
	 */
	public static void main(String[] args) {
		double sueldoBase,cantHorasExtras,sueldoTotal; 
		double totalHorasExtras;
		
		sueldoBase=Double.parseDouble(JOptionPane.
				showInputDialog("Ingrese el sueldo base"));
		System.out.println("Sueldo Base= "+sueldoBase);
		cantHorasExtras=Double.parseDouble(JOptionPane.
				showInputDialog("Ingrese la cantidad de horas extras"));
		System.out.println("Cantidad Horas Extras= "+cantHorasExtras);
		
		totalHorasExtras=cantHorasExtras*3000;
		System.out.println("Total Horas Extras= "+totalHorasExtras);
		sueldoTotal=sueldoBase+totalHorasExtras;
				
		System.out.println("El sueldo total es: "+sueldoTotal);
		
	}

}
