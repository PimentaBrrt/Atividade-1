package Ex4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
        ArrayList<Triangulo> array = new ArrayList<>();

        array.add(new Triangulo(3, 4, 5));  
        array.add(new Triangulo(5, 7, 9));
        array.add(new Triangulo(5, 12, 13));
        array.add(new Triangulo(50, 12, 13));

        for (int i = 0; i < array.size(); i++) {
            System.out.println("\nTriângulo " + (i + 1) + "- " + "\n" + array.get(i));
        }

    }
}
