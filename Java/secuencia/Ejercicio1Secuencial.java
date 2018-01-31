package secuencia;
import javax.swing.JOptionPane;

public class Ejercicio1Secuencial {
	/*
	 * Algoritmo que lea tres notas y calcule e imprima
	 * el promedio de ellas.
	 */
	public static void main(String[] args) {
		double nota1,nota2,nota3,prom = 0;
		
		nota1=Double.parseDouble(JOptionPane.
				showInputDialog("Ingrese nota1"));
		nota2=Double.parseDouble(JOptionPane.
				showInputDialog("Ingrese nota2"));
		nota3=Double.parseDouble(JOptionPane.
				showInputDialog("Ingrese nota3"));
			
		prom=(nota1+nota2+nota3)/3;	
				
		String mensaje="nota1= "+nota1+"\n";
		mensaje+="nota2= "+nota2+"\n";
		mensaje+="nota3= "+nota3+"\n\n";
		mensaje+="El promedio es: "+prom+"\n";
				
		System.out.println(mensaje);
		JOptionPane.showMessageDialog(null,mensaje);

	}

}
