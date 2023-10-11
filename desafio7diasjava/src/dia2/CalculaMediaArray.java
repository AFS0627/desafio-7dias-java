package dia2;
//Write a Java program to calculate the average value of array elements
public class CalculaMediaArray {
    public static void main(String[] args) {
        int[] numeros = {5, 10, 15, 20, 25};
        double media = calcularMedia(numeros);
        System.out.println("A média dos números no array é: " + media);
    }

    public static double calcularMedia(int[] array) {
        int soma = 0;

        for (int numero : array) {
            soma += numero;
        }

        double media = (double) soma / array.length;

        return media;
    }
}
