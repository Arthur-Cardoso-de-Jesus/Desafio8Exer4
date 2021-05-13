/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafio8exer4;

import java.util.Scanner;

/**
 *
 * @author Arthur Cardoso de Jesus
 */
public class Desafio8Exer4 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int numero, rodada, intervalo;
        intervalo = 0;
        numero = 0;
        rodada = 1;
        while (rodada <= 10) {
            System.out.println("Coloque um valor:");
            numero = ler.nextInt();
            if (numero >= 10 && numero <= 20) {
                intervalo++;
                rodada++;
            } else {
                rodada++;
            }
        }
        System.out.println("A quantidade de numeros dentro do intervalo foi de:" + intervalo);
    }

}
