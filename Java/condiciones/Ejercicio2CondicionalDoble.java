package condiciones;

import javax.swing.JOptionPane;

public class Ejercicio2CondicionalDoble {
	/*
	 * La tienda "Mis Zapatos" está de aniversario, por esa razón se
	 * está realizando un descuento del 50% en compras mayores o 
	 * iguales a los $ 100.000 y un descuento del 10% en compras 
	 * normales, Haga un algoritmo que permita validar 
	 * cuando se debe aplicar un descuento a un cliente, en caso de 
	 * que el descuento sea valido se debe informar al usuario 
	 * indicando el valor descontado.
	 */
	public static void main(String[] args) {
		
		double valorCompra=0,descuento=0,valorFinal=0;
		String mensaje="";
		
		valorCompra=Double.parseDouble(JOptionPane.
				showInputDialog("Ingrese el valor de su compra"));
		
		if(valorCompra>=100000){
			descuento=valorCompra*0.5;
			valorCompra=valorCompra-descuento;
			System.out.println("Se realizó un descuento del 50% "
					+ "equivalente a: "+descuento);
		}else{
			descuento=valorCompra*0.1;
			valorCompra=valorCompra-descuento;
			System.out.println("Se realizó un descuento del 10% "
					+ "equivalente a: "+descuento);
		}
		
		System.out.println("El valor a pagar es: "+valorCompra);
		

	}


}
