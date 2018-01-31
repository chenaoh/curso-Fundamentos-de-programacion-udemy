package condiciones_multiples;

import javax.swing.JOptionPane;

public class Ejercicio3CondicionalMultiple {
	/*
	 * Algoritmo que basado en la siguiente tabla realice los
	 * procesos correspondientes
	 * 1. Ejercicio 1 Secuencial simple
	 * 2. Ejercicio 1 Condicional simple
	 * 3. Ejercicio 1 Condicional Doble
	 * 4. Ejercicio 1 Condicional Multiple con condicion Anidada
	 * 5. Ejercicio 2 Condicional Anidada
	 */
	public static void main(String[] args) {
		double valorCompra=0,descuento=0,valorFinal=0;
		double nota1,nota2,nota3,prom = 0;
		
		int cod=0;
		String menu="MENU DE OPCIONES\n\n";
		
		menu+="1. Ejercicio 1 Secuencial simple\n";
		menu+="2. Ejercicio 1 Condicional simple\n";
		menu+="3. Ejercicio 1 Condicional Doble\n";
		menu+="4. Ejercicio 1 Condicional Multiple con condicion Anidada\n";
		menu+="5. Ejercicio 1 Condicional Anidada\n\n";
		menu+="Ingrese una opción\n";
		
		cod=Integer.parseInt(JOptionPane.showInputDialog(menu));
		
		switch (cod) {
		case 1://
				
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
			
			//				
			break;
		case 2:
					
			valorCompra=Double.parseDouble(JOptionPane.
					showInputDialog("Ingrese el valor de su compra"));
			
			if(valorCompra>=100000){
				descuento=valorCompra*0.5;
				valorCompra=valorCompra-descuento;
				System.out.println("Se realizó un descuento del 50% "
						+ "equivalente a: "+descuento);
			}
			
			System.out.println("El valor a pagar es: "+valorCompra);
			break;
		case 5:
					int codigo=0;
					String mensaje2="MENU\n\n";
					
					mensaje2+="1. Lunes\n";
					mensaje2+="2. Martes\n";
					mensaje2+="3. Miercoles\n";
					mensaje2+="4. Jueves\n";
					mensaje2+="5. Viernes\n";
					mensaje2+="6. Sabado\n";
					mensaje2+="7. Domingo\n";
					
					codigo=Integer.parseInt(JOptionPane.
							showInputDialog(mensaje2+"\n Ingrese el codigo"));
					
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
					
					
					
			break;
		default:
			break;
		}
		
		
		
	}

}
