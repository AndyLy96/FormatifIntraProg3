package org.nomfamille.exo1;

public class Imperatif {


   /* -------------- MODIFIEZ UNIQUEMENT LE CODE, PAS LES TESTS -------------*/


    public static String rectangle(int hauteur, int largeur){

        String res = "";
        res += ligne(largeur);
//        for (int i = 1; i < hauteur; i++) {
//            for (int j = 1; j < largeur; j++) {
//                if (i == 1 || i == hauteur || j == 1 || j == largeur)
//                    res += "#";
//                else
//                   res += " ";
//            }
//            res += "\n";
//        }
        for(int ligne = 0 ; ligne < hauteur-2; ligne++) {
            res+= ligneATrou(largeur);
        }
        res += ligne(largeur);
        return res;
    }

    private static String ligneATrou(int largeur) {
        String res = "#";
        for (int i = 0 ; i< largeur-2 ; i++){
            res+= " ";
        }
        return res+"#\n";
    }

    private static String ligne(int largeur) {
        String res = "";
        for (int i = 0 ; i< largeur ; i++){
            res+= "#";
        }
        return res+"\n";
    }


    public static Integer premiersEntiers(int max){
        if (max < 0 ) throw new IllegalArgumentException();
        if (max == 0 ) throw new IllegalArgumentException();
        // toute
        // toute validation a ete faite je sais que les valeurs sont bonnes
        int cpt =1;
        int nombre = 1;
        int[] tabmoyenne = new int[max];
        for (int i = 0;i < max ;i++)
        {
            System.out.print(cpt);
            tabmoyenne[i] = cpt;
            cpt++;
        }
        for (int p = 0; p<tabmoyenne.length ; p++)
        {
            nombre *= tabmoyenne[p];
        }
        return nombre;
    }


}
