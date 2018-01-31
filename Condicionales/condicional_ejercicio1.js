La tienda "Mis Zapatos" está de aniversario, por esa razón se está
realizando un descuento del 50% en compras mayores o iguales a los 
$ 100.000. Haga un algoritmo que permita validar cuando se debe aplicar 
un descuento a un cliente, en caso de que el descuento sea valido se debe 
informar al usuario indicando el valor descontado.

INICIO
	numerico valorCompra,descuento,valorFinal;
	imprima "ingrese el valor de la compra";
	lea valorCompra;
	
	descuento=0;
	valorFinal=valorCompra;
	
	si(valorCompra>=100000)
	{
		descuento=valorCompra*0.5;
		valorFinal=valorCompra-descuento;
		imprima "Se aplicó un descuento del 50% equivalente a: "+descuento;
	}
	
	imprima "El valor de su compra es: "+valorFinal;	

FINAL
  