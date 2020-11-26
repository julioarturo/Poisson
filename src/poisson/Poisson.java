/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poisson;

import static java.lang.Math.exp;
import java.util.Scanner;
/**
 *
 * @author DEVIND
 */
public class Poisson {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        double constante,R = 30,Fact = 1,sum = 0,Pois = 0,VP =0,lambda=0;
        System.out.println("Ingrese el valor de lamda");
        lambda = leer.nextDouble();
        constante = exp(-lambda);
        for(int x = 0; sum <= R ; x++){
            if(x==0){
                Pois = constante * (Math.pow(lambda, x));
                sum = sum + Pois;
            }else{
                Fact = Fact * x;
                Pois = (constante *(Math.pow(lambda, x)))/Fact;
                sum = sum + Pois;
            }
            VP = x;
            System.out.println(VP);
        }
        
    }
    
}
