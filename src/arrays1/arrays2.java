package arrays1;

public class arrays2 {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		int [] a = {10,9,3,2,1,7,0,3,2,0,12,0};
		System.out.println("El número de ceros en las notas es: ");
		System.out.println(getCount(a));
	}
		
	public static int getCount (int [] values) {
		int count = 0;
		for(int i=0; i<values.length; i++) {
			//Código que cuenta el número de ceros del array que se pasa por parámetro
			if(values[i] == 0)
				count++;
		}
		return count;
	}
}
