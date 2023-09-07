package org.mboup;

public class TrouverU {
    public static int trouver(String [] tableau, String element) throws ElementIntrouvable {
        for (int i = 0; i < tableau.length; i++) {
            if(tableau[i].equals(element)){
                return i;
            }
        }
        throw new ElementIntrouvable("Votre recherche "+element+" n'existe pas dans le tableau");

    }


}
