algoritmo que reciba como entrada el sueldo de una persona
y sus horas extras trabajadas y luego imprima el Sueldo 
total de esta persona dado que cada hora extra vale $3000.

INICIO
	numerico sueldoBase,cantHorasExtras,sueldoTotal; 
	numerico totalHorasExtras;
	
	imprima "Ingrese el sueldo base";
	lea sueldoBase;
	imprima "ingrese la cantidad de horas extras trabajadas";
	lea cantHorasExtras;
	
	totalHorasExtras=cantHorasExtras*3000;
	
	sueldoTotal=sueldoBase+totalHorasExtras;
	
	imprima "El sueldo total es = "+sueldoTotal;

FINAL