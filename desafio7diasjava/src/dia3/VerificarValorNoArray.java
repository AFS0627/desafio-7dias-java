package dia3;

public class VerificarValorNoArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        int Verificar = 3;
        boolean contem = contemValor(array, Verificar);
       
        if (contem) {
            System.out.println("O array contém o valor " + Verificar + ".");
        } else {
            System.out.println("O array NÃO contém o valor " + Verificar + ".");
        }
    }
  
    public static boolean contemValor(int[] array, int valor){
        for (int elemento : array) {
            if (elemento == valor) {
                return true;
            
            }
    }
		return false;
    }
}
