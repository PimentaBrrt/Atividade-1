package Ex2;

import java.util.ArrayList;
import java.util.Scanner;

// A ordem de complexidade do método checar() é O(n³), ou seja, tem performance péssima com números de n grandes

public class Ex2 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> array = new ArrayList<>();

        System.out.print("Insira o tamanho do vetor (mín 3): ");
        int n = scanner.nextInt();

        while (n <= 2) {
            System.out.print("Insira um tamanho válido (mínimo 3): ");
            n = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            System.out.print("Insira o número da posição " + (i + 1) + ": ");
            int num = scanner.nextInt();
            array.add(num);
        }

        boolean check = checar(array);

        if (check) {
            System.out.println("Existe um elemento que é a soma de dois anteriores.");
        } else {
            System.out.println("Nenhum elemento é a soma de dois anteriores.");
        }

        scanner.close();

    }

    public static boolean checar(ArrayList<Integer> array) {
        for (int i = 2; i < array.size(); i++) {
            for (int j = 0; j < i; j++) {
                for (int k = 0; k < i; k++) {
                    if (j != k && array.get(j) + array.get(k) == array.get(i)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

}
