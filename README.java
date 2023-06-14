package com.mycompany.calculadora;

import java.util.Scanner;

public class Calculadora {
    
    public static void main(String[] args) {
   
    Scanner entrada = new Scanner(System.in);
        
    double n1, n2, suma, resta, div, mult;

       
        System.out.println("Digite un numero");
        n1= entrada.nextDouble();
        
        System.out.println("Digite otro numero");
        n2= entrada.nextDouble();
        
        suma= n1+n2;
        resta= n1-n2;
        mult= n1*n2;
        div= n1/n2;       
        
        System.out.println("El resultado de la suma es: "+suma);
        System.out.println("El resultado de la resta es: "+resta);
        System.out.println("El resultado de la multiplicacion es: "+mult);
        System.out.println("El resultado de la division es: "+div);
}
}
