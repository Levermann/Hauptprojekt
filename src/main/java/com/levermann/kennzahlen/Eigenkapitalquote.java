package com.levermann.kennzahlen;

public class Eigenkapitalquote {
    public static void main(String[] args) {
        // TODO code application logic here
        float ekQuote;
        int levermann;
        ekQuote = eigenkapitalquote(50, 150);
        System.out.println("3. Eigenkapitalquote: " + ekQuote);
        levermann = eigenkapitalquoteBewertung(ekQuote, true);
        System.out.println("Levermannwertung: " + levermann);
    }

    //berechnet die Eigenkapitalrendite
    public static float eigenkapitalquote(float eigenkapital, float fremdkapital){
        float quote;
        quote = eigenkapital / (eigenkapital + fremdkapital);
        return quote;
    }

    //berechne die Levermannwertung für die gegebene Eigenkapitalrendite
    public static int eigenkapitalquoteBewertung(float ekQuote, boolean finanzsegment){
        int retval;

        float upperLimit, lowerLimit;
        if(finanzsegment == true){
            upperLimit = (float)0.10;
            lowerLimit = (float)0.05;
        }else{
            upperLimit = (float)0.25;
            lowerLimit = (float)0.15;
        }
        /*
        retval > 0 falls ekQuote > Grenze
        retval = 0 falls ekQuote = Grenze
        retval < 0 falls ekQuote < Grenze
        */
        retval = Float.compare(ekQuote, upperLimit);
        if (retval > 0){
            return 1;
        }else{
            retval = Float.compare(ekQuote, lowerLimit);
            if (retval >= 0){
                return 0;
            }else{
                return -1;
            }
        }
    }
}
