package fp.daw.examen;

public class Ejercicio1 {

	/* 
	 * 1 punto
	 * 
	 * Define, después de este comentario, un método llamado 'mostrarVector' que
	 * reciba mediante un parámetro formal un vector de números enteros y lo muestre por
	 * pantalla en una única línea con el formato siguiente:
	 * 
	 * 				[num1, num2, num3, ...., numN]
	 * 
	 * donde num1, num2, num3, ..., numN son los números almacenados en el vector.
	 */
	
	
	
	/*  Hago el metodo para que retorne un vector que es el que se utiliza en el ejercicio 4, posteriormente hago que
	 * se muestre en pantalla "el vector es" para que se muestre, y hago un for ya que quiero que tenga cierto valor depende
	 * la "i" */
	
	public static int[] mostrarVector(int [] vector) {

				System.out.println("El vector es: ");
						
				for (int i=0; i<vector.length;i++) {
				System.out.print (vector[i]) ;
			}
	
	return vector;		
	}
			
			
			
				
				



	// En est
	
	/* 
	 * 1 punto
	 * 
	 * Define, después de este comentario, la vesión sobrecargada del método anterior que
	 * muestre por pantalla un vector de caracteres con el formato siguiente:
	 * 
	 * 				['c1', 'c2', 'c3', ...., 'cN']
	 * 
	 * donde 'c1', 'c2', 'c3', ...., 'cN' son los caracteres almacenados en el vector.
	 */

	
	
	/* hago basicamente lo mismo que el otro ejercicio pero esta vez con char*/
	public static char[] mostrarVector(char [] vector) {

		System.out.println("El vector es: ");
				
		for (int i=0; i<vector.length;i++) {
		System.out.print (vector[i]) ;
		
		
	}
		return vector;	
	}

	

}

