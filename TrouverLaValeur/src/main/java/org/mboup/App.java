package org.mboup;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        System.out.println("Recherche: ");
        Scanner input = new Scanner(System.in);
        String[]tableau = {"Lundi","Mardi","Mercredi","Jeudi","Vendredi","Samedi","Dimanche"};
        String element = input.nextLine();



        try{
            int index= TrouverU.trouver(tableau, element);
            System.out.println("Votre Recherche: "+element+" a été trouver a l'index: "+index);
        }catch (ElementIntrouvable e){
            System.out.println(e.getMessage());
        }
    }

}
