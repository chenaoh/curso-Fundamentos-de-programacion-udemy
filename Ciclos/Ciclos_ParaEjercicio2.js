algoritmo que reciba como entrada el sueldo de n personas y sus horas extras trabajadas y luego imprima el Sueldo 
total de cada persona dado que cada hora extra vale $3000.


INICIO
	numerico sueldoBase,cantHorasExtras,sueldoTotal; 
	numerico totalHorasExtras, cantPersonas,i;
	
	imprima "Ingrese la cantidad de personas a validar";
	lea cantPersonas;
	
	para(i=0,i<cantPersonas,i++){ 
		
		imprima "Ingrese la información de la persona "+(i+1);

		imprima "Ingrese el sueldo base";
		lea sueldoBase;
		imprima "ingrese la cantidad de horas extras trabajadas";
		lea cantHorasExtras;
		
		totalHorasExtras=cantHorasExtras*3000;
		
		sueldoTotal=sueldoBase+totalHorasExtras;
		
		imprima "El sueldo total es = "+sueldoTotal;
				
	}
	

FINAL

  