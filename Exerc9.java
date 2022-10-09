package Questao9;

import java.util.Scanner;

// Faça um Programa que peça a temperatura em graus Fahrenheit, transforme e mostre a temperatura em graus Celsius.
// C = 5 * ((F-32) / 9).

public class Exerc9 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        float fahrenheit, celsius;

        Scanner fran = new Scanner(System.in);

        System.out.println("Temperatura em Fahrenheit");

        fahrenheit = fran.nextFloat();
        celsius = 5 * ((fahrenheit-32) / 9);

        System.out.println("A temperatura em graus Celsius é: " + celsius);    
        
        fran.close();
    }

}
