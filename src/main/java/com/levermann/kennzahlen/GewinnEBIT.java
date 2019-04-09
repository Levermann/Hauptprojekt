package com.levermann.kennzahlen;

public class GewinnEBIT {
    public static void main(String[] args) {
        // TODO code application logic here
        float gMarge;
        int levermann;
        gMarge = gewinnMarge(75, 600);
        System.out.println("2. Gewinnmarge: " + gMarge);
        levermann = gewinnmargeBewertung(gMarge);
        System.out.println("Levermannwertung: " + levermann);
    }

    //berechnet die Eigenkapitalrendite
    public static float gewinnMarge(float gewinn, float jahresumsatz){
        float marge;
        marge = gewinn / jahresumsatz;
        return marge;
    }

    //berechne die Levermannwertung für die gegebene Eigenkapitalrendite
    public static int gewinnmargeBewertung(float marge){
        int retval;
        float upperLimit = (float)0.12;
        float lowerLimit = (float)0.06;
        /*
        retval > 0 falls marge > Grenze
        retval = 0 falls marge = Grenze
        retval < 0 falls marge < Grenze
        */
        retval = Float.compare(marge, upperLimit);
        if (retval > 0){
            return 1;
        }else{
            retval = Float.compare(marge, lowerLimit);
            if (retval >= 0){
                return 0;
            }else{
                return -1;
            }
        }
    }
}
