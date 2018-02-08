import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Cuántos elementos vas a introducir?? ");
		sc = new Scanner(System.in);
		int elementos = sc.nextInt();
		
		Integer [] arrElementos = new Integer[elementos];
		
		//arrElementos.length == elementos
		for(int i=0; i<elementos; i++ ) {
			System.out.println("Introduce elemento ");
			sc = new Scanner(System.in);
			arrElementos[i] = sc.nextInt();
		}
		
		System.out.println("Antes de ordenadr");
		System.out.println(Arrays.toString(arrElementos));
		
		Arrays.sort(arrElementos);
		
		System.out.println("Después de ordenar");
		System.out.println(Arrays.toString(arrElementos));
	
		// Faltaría darle la vuelta al array!!!!!!
		System.out.println("Después de ordenar descendente");
		Arrays.sort(arrElementos, Collections.reverseOrder());
		System.out.println(Arrays.toString(arrElementos));
		
	}

	
}
