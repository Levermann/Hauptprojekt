package com.levermann.kennzahlen;

public class Eigenkapitalrendite {


    public static void main(String[] args) {
        // TODO code application logic here
        float ekRendite;
        int levermann;
        ekRendite = eigenkapitalrendite(10, 50);
        System.out.println("1. Eigenkapitalrendite: " + ekRendite);
        levermann = eigenkapitalrenditeLevermann(ekRendite);
        System.out.println("Levermannwertung: " + levermann);
    }

    //berechnet die Eigenkapitalrendite
    public static float eigenkapitalrendite(float jue, float ek){
        float rendite;
        rendite = jue / ek;
        return rendite;
    }

    //berechne die Levermannwertung für die gegebene Eigenkapitalrendite
    public static int eigenkapitalrenditeLevermann(float rendite){
        int retval;

        float upperLimit = (float)0.2;
        float lowerLimit = (float)0.1;
        /*
        retval > 0 falls rendite > Grenze
        retval = 0 falls rendite = Grenze
        retval < 0 falls rendite < Grenze
        */
        retval = Float.compare(rendite, upperLimit);
        if (retval > 0){
            return 1;
        }else{
            retval = Float.compare(rendite, lowerLimit);
            if (retval >= 0){
                return 0;
            }else{
                return -1;
            }
        }
    }
}