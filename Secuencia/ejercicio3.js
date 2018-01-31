Algoritmo que calcule lo que gana un empleado con base a las horas trabajadas teniendo en cuenta
que cada hora se paga a 2000, adicionalmente se le realiza unos descuentos con respecto a un 
impuesto de seguridad del 10% sobre su salario.

El sistema debe imprimir un mensaje indicando el nombre del empleado y su sueldo total.

INICIO
	texto nombre;
	numerico sueldoNeto,sueldoBruto,impuesto,cantHorasTrabajadas;
	
	imprima "ingrese el nombre del empleado";
	lea nombre;
	
	imprima "Ingrese la cantidad de horas trabajadas";
	lea cantHorasTrabajadas;
	
	sueldoBruto=cantHorasTrabajadas*2000;
	impuesto=sueldoBruto*0.10;
	sueldoNeto=sueldoBruto-impuesto;
	
	imprima "El empleado "+nombre+" tiene un sueldo total de "+sueldoNeto;

FINAL