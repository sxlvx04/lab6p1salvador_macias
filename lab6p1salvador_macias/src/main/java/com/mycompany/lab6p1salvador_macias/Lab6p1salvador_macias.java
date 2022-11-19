package com.mycompany.lab6p1salvador_macias;

import java.util.Scanner;

import java.util.Random;

public class Lab6p1salvador_macias {

    public static void main(String[] args) {
        menu();

    }//fin main

    public static void menu() {
        boolean bool = true;
        Scanner entrada = new Scanner(System.in);
        Scanner nom = new Scanner(System.in);
        do {
            System.out.println("-----------------------------------------------");
            System.out.println("Ingrese su nombre: ");
            String nombre = nom.nextLine();
            System.out.println("Bienvenido al menu " + nombre + "!!!");
            System.out.println(nombre + " estas son las opciones disponibles del menu: ");
            System.out.println("1.juego de la vida\n2.piedra,papel,o tijeras...\n3.blink");
            System.out.println(nombre + " Porfavor elige una opcion disponible:");
            int opc = entrada.nextInt();
            switch (opc) {

                case 1: {
                    juego_vida();

                }
                break;
                case 2: {
                    rockpaper();

                }
                break;
                case 3: {
                    blink_recibir();
                    imprimir_blink(int matriz[][]);
                    
                }
                break;
                
                default:

                    bool = false;

                    System.out.println(nombre + " La opcion ingresada es invalida, se abandonara el menu");
                    System.out.println(nombre+" Gracias por usar mi programa!!");
                    
                    
            }//  fin case 

        } while (bool != false);//fin while
    }// fin menu

    public static void juego_vida() {
        Scanner entrada = new Scanner(System.in);
        int matriz[][] = new int[8][8]; 
        
        
        
        
    }//fin juego_vida

    public static void rockpaper(){
        Scanner entrada = new Scanner (System.in);
        System.out.println("Estas son las opciones dispnibles: ");
        System.out.println("1.tijeras\n2.papel\n3.piedra\n4.lizard\n5.spock");
        int player = entrada.nextInt();
        int pc = (int)(Math.random()*5+ 1);
        int tppls [][] = new int [5][4];
            if(player=1&&pc=1)
        
        
    }//fin rockpaper

    public static void blink_recibir() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese cantidad de filas: ");
        int filas = entrada.nextInt();
        System.out.println("Ingrese cantidad de columnas: ");
        int columnas = entrada.nextInt();
        int matriz[][] = new int[filas][columnas];
        int dado;
        mewRandom().nextInt((5-1)+1)+1;
        
        

    }//fin blink

   public static void imprimir_blink(int [][]matriz){
       for(int i=0;i<matriz.length;i++){
           for(int j=0;j<matriz[i].length;j++){
               System.out.println("["+matriz[i][j]+"]");
   
   
           }   
           
       }
   }//fin imprimir_blink

}//fin clase