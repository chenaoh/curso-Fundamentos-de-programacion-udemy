La tienda "Mis Zapatos" está de aniversario, por esa razón se está
realizando un descuento del 50% en compras mayores o iguales a los 
$ 100.000 y un descuento del 10% en compras normales, Haga un algoritmo 
que permita validar cuando se debe aplicar un descuento a un cliente, 
se debe informar al usuario indicando el valor descontado.

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
	sino
	{
		descuento=valorCompra*0.1;
		valorFinal=valorCompra-descuento;
		imprima "Se aplicó un descuento del 10% equivalente a: "+descuento;
	}
	
	imprima "El valor de su compra es: "+valorFinal;	

FINAL
  