/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poisson;

import java.util.Scanner;

/**
 *
 * @author DEVIND
 */
public class javaRandom {

    public static void main(String[] args) {
        int n = 0, m;
        double lambda;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el valor de lamda");
        lambda = leer.nextDouble();
        System.out.println("Ingrese la cantidad de numeros a generar");
        m = leer.nextInt();
        for (int i = 0; i < m; i++) {
            n = getPoisson(lambda);
            System.out.println(i+1 +"-  " + n);
        }
    }

    public static int getPoisson(double lambda) {
        double L = Math.exp(-lambda);

        double p = 1.0;
        int k = 0;
        do {
            k++;
            p *= Math.random();
        } while (p > L);
        return k - 1;
    }

}
