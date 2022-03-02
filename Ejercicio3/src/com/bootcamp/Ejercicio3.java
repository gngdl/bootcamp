package com.bootcamp;

public class Ejercicio3 {

    public static void main(String[] args) {

        String textos[]= {"buenos","dias","como","estas?"};

        arrayConcat(textos);
    }
    public static void arrayConcat(String[] palabras){
        String frase="";
        for (String palabra : palabras){
            frase += " " + palabra;
        }
        System.out.println(frase);
     }

}
