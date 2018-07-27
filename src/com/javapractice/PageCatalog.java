package com.javapractice;

import java.net.*;

public class PageCatalog {

    public static void main(String[] args) {
        HomePage[] category = new HomePage[5];
        try {
            category[0] = new HomePage("Mark Evanier",
                    "http://www.newsfromme.com", "comic books");
            category[1] = new HomePage("Todd Smith",
                    "http://www.sharkbitten.com", "music");
            category[2] = new HomePage("Rogers Cadenhead",
                    "http://workbench.cadenhead.org", "programming");
            category[3] = new HomePage("Juan Cole",
                    "http://www.juancole.com", "politics");
            category[4] = new HomePage("Rafe Colburn",
                    "www.rc3.org");
            for (HomePage i: category) {
                System.out.println(i.owner + ": " + i.address + " - " + i.category);
            }
        } catch (MalformedURLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
