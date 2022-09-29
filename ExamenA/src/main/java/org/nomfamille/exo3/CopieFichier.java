package org.nomfamille.exo3;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CopieFichier {


    /* -------------- PAS DE TESTS -------------*/


    public static void main(String[] args) throws IOException {
        if (args.length > 0)
        {
            System.out.println(args[0]);
            FileReader file = new FileReader(args[0]);
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine())
            {
                String line = reader.nextLine();
                System.out.println(line);
            }
        }
        else
        {
            System.err.print("Aucun argument dans la ligne de commande.");
        }


        FileWriter file = new FileWriter("../monNom.txt");
        file.write("Ly Andy");
        file.close();



    }



}
