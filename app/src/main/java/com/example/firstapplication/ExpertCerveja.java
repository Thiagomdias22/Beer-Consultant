package com.example.firstapplication;

import android.widget.Switch;

import java.util.ArrayList;
import java.util.List;

public class ExpertCerveja {

    public ExpertCerveja() {
    }

    public List<String> getMarcas(String color){

        List<String> marcas = new ArrayList<>();

        switch (color){
            case "lager":
                marcas.add("Brahma");
                marcas.add("Kaiser");
                marcas.add("Stella Artois");
                break;
            case "pilsen":
                marcas.add("Bohemia");
                marcas.add("Devassa");
                marcas.add("Heinneken");
                break;
            case "ipa":
                marcas.add("Eisenbahn American");
                marcas.add("Roleta Russa Imperial");
                marcas.add("To Ol Null Zero IBU");
                break;
            case "amber":
                marcas.add("Baltika");
                marcas.add("Adnams Wild Hop");
                marcas.add("Dado Bier American");
                break;
            case "bock":
                marcas.add("Petra puro malte");
                marcas.add("Black Princess Dark");
                marcas.add("Black Pricess Gold");
                break;
            case "weiss":
                marcas.add("Dama Bier");
                marcas.add("Franziskaner Hefe-Weissbiers");
                marcas.add("Paulaner Hefe Weiss");
                break;
        }

        return marcas;
    }
}
