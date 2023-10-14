package dia5;
//8. Write a Java program to copy an array by iterating the array.
public class IterandoArray {
	public static void main(String[] args) {
        int[] arrayOriginal={1,2,3,4,5};

        int tamanho= arrayOriginal.length;

        int[] novoArray =new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            novoArray[i]=arrayOriginal[i];
        }

        System.out.print("Array Original: ");
        for (int i=0;i<tamanho;i++){
            System.out.print(arrayOriginal[i]+" ");
        }
        System.out.println();

        System.out.print("Novo Array: ");
        for (int i=0;i<tamanho;i++){
            System.out.print(novoArray[i] + " ");
        }
        System.out.println();
    }
}
