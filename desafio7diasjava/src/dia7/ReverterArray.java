package dia7;
//11. Write a Java program to reverse an array of integer values.
public class ReverterArray {
	    public static void main(String[] args) {
	        int[] matrizOriginal = {1,2,3,4,5};
	        
	        System.out.println("Matriz Original:");
	        imprimirMatriz(matrizOriginal);

	        int[] matrizReversa =reverter(matrizOriginal);

	        System.out.println("\nMatriz Reversa:");
	        imprimirMatriz(matrizReversa);
	    }

	    public static int[] reverter(int[] array) {
	        int esquerda=0;
	        int direita=array.length - 1;

	        while (esquerda<direita) {
	            int temp=array[esquerda];
	            array[esquerda]=array[direita];
	            array[direita]=temp;

	            esquerda++;
	            direita--;
	        }

	        return array;
	    }

	    public static void imprimirMatriz(int[] array) {
	        for (int i=0;i<array.length;i++) {
	            System.out.print(array[i]+" ");
	        }
	        System.out.println();
	    }
	}

