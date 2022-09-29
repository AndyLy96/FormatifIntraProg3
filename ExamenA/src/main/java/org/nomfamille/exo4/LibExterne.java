package org.nomfamille.exo4;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class LibExterne {


    /* -------------- PAS DE TESTS -------------*/


    public static void main(String[] args) throws IOException {
        Document doc = Jsoup.connect("https://departement-info-cem.github.io/3N5-Prog3/testbot/index.html").get();
        Elements link = doc.select("li");
        //Lien absolu
        //System.out.println(links.attr("abs:href"));
        for (Element links : link) System.out.println(links.select("li"));
    }

}

