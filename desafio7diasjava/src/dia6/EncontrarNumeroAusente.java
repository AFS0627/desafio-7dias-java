package dia6;
//24. Write a Java program to find a missing number in an array.
	public class EncontrarNumeroAusente {

	    public static int encontrarNumeroAusente(int[] nums) {
	        int tamanho=nums.length;
	        boolean[] presente= new boolean[tamanho + 1];

	        for (int num:nums){
	            if (num>=0&&num<=tamanho){
	                presente[num]=true;
	            }
	        }

	        for (int i=1;i<=tamanho;i++){
	            if (!presente[i]) {
	                return i;
	            }
	        }

	        return tamanho+1;
	    }

	    public static void main(String[] args){
	        int[] numeros = {1, 3, 4, 5};
	        int numeroAusente = encontrarNumeroAusente(numeros);
	        System.out.println("O número ausente no array é: " +numeroAusente);
	    }
	}

