package Ex3;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> array = new ArrayList<>();

        String check;

        do {
            System.out.print("\nDigite o elemento a ser inserido no array: ");
            int num = scanner.nextInt();
            array.add(num);
            scanner.nextLine();
            System.out.print("Você deseja inserir outro elemento? (s/n): ");
            check = scanner.nextLine();
        } while (check.equals("s"));

        System.out.print("Insira o valor inteiro k: ");
        int k = scanner.nextInt();

        reorganizar(array, k);

        System.out.println("k = " + k);
        System.out.println("Array reorganizado: " + array);

        scanner.close();

    }

    public static void reorganizar(ArrayList<Integer> array, int k) {

        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) <= k) {
                int aux = array.get(i);
                array.remove(i);
                array.add(0, aux);
            }
        }

    }

}
