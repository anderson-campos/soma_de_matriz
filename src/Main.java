import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scam = new Scanner(System.in);
        int[][] matriz = new int[4][4];
        int soma = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Valor da posição ["+i+"]["+j+"]");
                matriz[i][j] = scam.nextInt();
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                soma += matriz[i][j];
            }
            System.out.println("A soma da lina: "+i+", é de: "+soma);
        }
    }
}
