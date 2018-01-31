Algoritmo que basado en un codigo permita realizar operaciones matematicas con 2 numeros reales teniendo 
en cuenta lo siguiente:
	* |1|suma          |
	* |2|resta         |
	* |3|multiplicacion|
	* |4|division      |


INICIO
	numerico num1, num2, codigo, suma,resta,div,mult;
	text menu, resp;
	
	imprima "Ingrese los 2 numeros";
	lea num1;
	lea num2;
	
	menu="Menu";
	menu+="Que desea realizar?";
	menu+="1. Sumar";
	menu+="2. restar";
	menu+="3. Multiplicar";
	menu+="4. Dividir";  
	imprimir menu;
	
	lea codigo;
	
	segun sea(codigo)
	{
		caso 1:   suma=num1+num2;
					resp="La suma es: "+suma;
				break;
		caso 2:  resta=num1-num2;
					resp="La resta es: "+resta;
				break;
		caso 3: mult=num1*num2;
					resp="La multiplicacion es: "+mult;
				break;
		caso 4: 
					si(num2>0){
						div=num1/num2;
						resp="La division es: "+div;
					}sino{
						resp="El segundo numero debe ser mayor a 0";
					}
				break;
		default : resp= "El codigo no existe";
				break;
	}
	
	imprimir resp;
	
	
FINAL

  