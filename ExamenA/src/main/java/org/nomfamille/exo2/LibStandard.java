package org.nomfamille.exo2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class LibStandard {


    /* -------------- MODIFIEZ UNIQUEMENT LE CODE, PAS LES TESTS -------------*/


    public static List<Integer> nFoisN(int max) {
        List<Integer> liste = new ArrayList<Integer>();
        int num = 1;
        for(int p = 0; p < max; p++)
        {
            for (int i =0; i < num; i++)
            {
                liste.add(num);
            }
            num++;
        }
        return liste;
    }

    public static List<Integer> triCroissant(List<Integer> source) {
        Collections.sort(source);
        return source;
    }

}
