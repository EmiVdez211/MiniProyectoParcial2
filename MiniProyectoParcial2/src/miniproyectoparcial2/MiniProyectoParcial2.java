/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package miniproyectoparcial2;

import java.util.Scanner;

/**
 *
 * @author Ches Laptop
 */
public class MiniProyectoParcial2 {

    /**
     * @param args the command line arguments
     */
    public static String toBinary(int n) {
        if (n == 0) {
            return "";
        }
        return toBinary(n / 2) + (n % 2);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        int length = 8;
        System.out.println("Saludos, le convertire un numero a binario de 8 digitos");
        System.out.println("Que no sea un numero mayor a 255, porfavor");
        System.out.println("Por favor, ingrese un numero:");
        n = scan.nextInt();
        String binary = String.format("%0" + length + "d", Integer.valueOf(toBinary(n)));
        System.out.println(binary);
    }
}
