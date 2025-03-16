package Ex1;

import java.util.ArrayList;
import java.util.Scanner;

// A ordem de complexidade do método encontrar() é O(n), ou seja, é um algoritmo de complexidade linear

public class Ex1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> array = new ArrayList<>();
        int n;

        System.out.print("Informe o tamanho do array (min 2): ");
        n = scanner.nextInt();

        while (n < 2) {
            System.out.print("O tamanho do array deve ser no mínimo 2. Tente novamente: ");
            n = scanner.nextInt();
        }

        System.out.println("Informe os " + n + " números (no intervalo de 1 a " + (n - 1) + "):");
        for (int i = 0; i < n; i++) {
            System.out.print("Informe o número da posição " + (i + 1) + ": ");
            int num = scanner.nextInt();
            while (num < 1 || num > n - 1) {
                System.out.print("Número fora do intervalo permitido. Tente novamente: ");
                num = scanner.nextInt();
            }
            array.add(num);
        }
        
        int repetido = encontrar(array);
        System.out.println("Número repetido: " + repetido);
        
        scanner.close();

    }

    public static int encontrar(ArrayList<Integer> array) {
        ArrayList<Boolean> visto = new ArrayList<>();
        for (int i = 0; i < array.size(); i++) {
            visto.add(false);
        }

        for (int num : array) {
            if (visto.get(num)) {
                return num;
            }
            visto.set(num, true);
        }
        return -1;
    }
}
