import java.util.Arrays;

public class Ej4 {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente

		int [] numeros = {1,4, 9, 7, 3, 2, 5, 11, 0, 9};
		
		System.out.println(Arrays.toString(numeros));
		for(int i=0; i < 5; i++) {
			
			int aux = numeros[i];
			numeros[i] = numeros[i+5];
			numeros[i+5] = aux;
			
		}
		
		System.out.println(Arrays.toString(numeros));
	}

}
