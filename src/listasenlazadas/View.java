/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listasenlazadas;

import java.util.Scanner;

/**
 *
 * @author mendoza
 */
public class View {
    
    public static void showHeader(){
    
        System.out.println("\t\t*****************************************");
        System.out.println("\t\t*\t LISTAS ENLAZADAS SIMPLE \t*");
        System.out.println("\t\t*****************************************");
        
    }
    
    public static void showSize(int size){
    
        System.out.println("\t\t* \t Tamaño de Lista "+size+" \t\t*");
        System.out.println("\t\t*****************************************\n");
        
    }
    
    public static void showMenu(){
    
        System.out.println("\t\t 1.- Agregar al Inicio.");
        System.out.println("\t\t 2.- Agregar al Final.");
        System.out.println("\t\t 3.- Mostrar Lista.");
        System.out.println("\t\t 4.- Buscar en la Lista.");
        System.out.println("\t\t 5.- Eliminar por posicion.");
        System.out.println("\t\t 6.- Eliminar Todo.");
        System.out.println("\t\t 7.- Salir.");

    }
    
    public static int showCodigo(){
    
        System.out.print("\t\t Ingrese el Codigo a buscar : ");
        Scanner keyboard = new Scanner(System.in);
        return keyboard.nextInt();

    }
    
    public static int showPosicion(){
    
        System.out.print("\t\t Ingrese la posicion a eliminar : ");
        Scanner keyboard = new Scanner(System.in);
        return keyboard.nextInt();

    }
    
    public static int showContinue(){
    
        System.out.print("\t\t presione cualquier numero para continuar : ");
        Scanner keyboard = new Scanner(System.in);
        return keyboard.nextInt();

    }
    
    public static int showPersonaCodigo(){
    
        System.out.print("\t\t Ingrese el codigo de la persona : ");
        Scanner keyboard = new Scanner(System.in);
        return keyboard.nextInt();
        
    }
    
    public static String showPersonaNombre(){
    
        System.out.print("\t\t Ingrese el nombre de la persona : ");
        Scanner keyboard = new Scanner(System.in);
        return keyboard.next();
        
    }
    
    public static int showPersonaEdad(){
    
        System.out.print("\t\t Ingrese la edad  de la persona : ");
        Scanner keyboard = new Scanner(System.in);
        
        return keyboard.nextInt();
        
    }
    
    public static int showOption(){
    
        System.out.print("\t\t Ingrese una opcion : ");
        Scanner keyboard = new Scanner(System.in);
        return keyboard.nextInt();
        
    }
    
    public static void showInvalidOption(){
    
        System.out.print("\t\t Opcion invalida...");

        
    }
    public static void showThanks(){
    
        System.out.println("\t\t Saliendo, Gracias!...");

        
    }
    
    
    
}
