package Ex4;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class Triangulo {
    
    private double a, b, c;
    private boolean is_triangulo;

    public Triangulo(double a, double b, double c) {

        this.a = a;
        this.b = b;
        this.c = c;

        if (a + b < c || a + c < b || b + c < a) {
            is_triangulo = false;
        } 
        else {
            is_triangulo = true;
        }

    }

    public double calcArea() {
        if (is_triangulo) {
            double p = (a + b + c) / 2;
            return sqrt(p * (p - a) * (p - b) * (p - c));
        }
        else {
            return 0;
        }
    }

    public double calcPerimetro() {
        if (is_triangulo) {
            return a + b + c;
        }
        else {
            return 0;
        }
    }

    public double[] calcCentroide() {
        if (is_triangulo) {
            double lambda = (pow(a, 2) + pow(b, 2) - pow(c, 2)) / (2 * a * b);
            double x = (b + a * lambda) / 3;
            double y = (a / 3) * sqrt(1 - pow(lambda, 2));
            return new double[]{x, y};
        }
        else {
            return new double[]{0, 0};
        }
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    @Override
    public String toString() {
        if (this.calcPerimetro() != 0) {
            double[] centroide = this.calcCentroide();
            return "Área do triângulo: " + this.calcArea() +
            "\nPerímetro do triângulo: " + this.calcPerimetro() +
            "\nCoordenadas x e y do centróide: (" + centroide[0] + ", " + centroide[1] + ")";
        } 
        return "Este objeto recebeu parâmetros incorretos na sua formação e não é um triângulo.";
    }

}
