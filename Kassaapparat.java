package com.example.kassaapparat;

import java.util.Scanner;

public class Kassaapparat {
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);

        System.out.print("Hur många pennor vill du köpa?: ");
        int AntalPennor= scan.nextInt();
        System.out.print("Hur mycket kostar 1 penna?: ");
        int KostnadPenna= scan.nextInt();

        System.out.print("Hur många linjaler vill du köpa?: ");
        int AntalLinjaler= scan.nextInt();
        System.out.print("Hur mycket kostar 1 linjal?: ");
        int KostnadLinjal= scan.nextInt();

        System.out.print("Du vill köpa " + AntalPennor + " penna/or och kostnad per styck är " + KostnadPenna + ".");
        System.out.print(" Du vill köpa " + AntalLinjaler + " linjal/er och kostnad per styck är " + KostnadLinjal + ".");
    }
}

