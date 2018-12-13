package fp.daw.examen;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio5 {

	/* 
	 * 2 puntos
	 * 
	 * Crea en el método 'main' un juego que consista en generar de forma aleatoria
	 * un número entero comprendido entre 100 y 200 y pedirle al usuario que lo
	 * adivine. Para ello el programa le pedirá que introduza por teclado un número.
	 * Si introduce el número correcto se mostrará un mesaje por pantalla indicando
	 * que ha acertado acompañado del número de intentos realizados y del tiempo
	 * empleado. A continuación, se le dará al usuario la opción de volver a jugar o
	 * de finalizar el juego.
	 * 
	 */
	
	
	
	/* En este ejercicio numero sera el numero aleatorio que para eso hago el Random, usuario sera el numero que ponga el usuario,
	 * acumulador sera para el numero de intentos que haga, entonces empieza el bucle, pide que adivine el numero (podria haber hecho
	 * otro do while para que diese error si no pone un numero pero no me dio tiempo), con el long quiero que sepa el tiempo entre que lo 
	 * adivina, luego se muestra todo, el unico que problema es que no se muestra el tiempo, al poner + t + me marca error */
	
	public static void main(String[] args) {
		
		int acumulador=0;
		int numero=0;
		int usuario=0;
		long t0=System.currentTimeMillis();
		do {
			
			 System.out.print("Adivine el Numero: ") ;
		Random r=new Random();
		numero= r.nextInt(101) + 100;
		
		 	
		 
		Scanner in=new Scanner(System.in);
		usuario=in.nextInt();
		
			
		
		if (usuario!=numero) {
			acumulador++;
		}
		}while(usuario!=numero);
		
		long t1=System.currentTimeMillis();
		long t=t1-t0;
		
	System.out.println("Has acertado " +  "numero de intentos: " + acumulador);   //aqui queria poner el tiempo pero me daba error
     System.out.println("�Quieres volver a jugar?");   
		
     

    	
    	
}

	}


