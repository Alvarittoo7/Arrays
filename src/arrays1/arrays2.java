package arrays1;

public class arrays2 {

	public static void main(String[] args) {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		int [] a = {10,9,3,2,1,7,0,3,2,0,12,0};
		System.out.println("El n�mero de ceros en las notas es: ");
		System.out.println(getCount(a));
	}
		
	public static int getCount (int [] values) {
		int count = 0;
		for(int i=0; i<values.length; i++) {
			//C�digo que cuenta el n�mero de ceros del array que se pasa por par�metro
			if(values[i] == 0)
				count++;
		}
		return count;
	}
}
