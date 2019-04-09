package com.levermann.kennzahlen;

public class KursgewinnVerhältnis5Jahre {
    public static void main(String[] args) {
        float kgv;
        int levermann;
        float[] gewinne = new float[5];
        gewinne[0] = (float)5;
        gewinne[1] = (float)1;
        gewinne[2] = (float)1;
        gewinne[3] = (float)1;
        gewinne[4] = (float)1;
        kgv = kursGewinnVerhältnis(gewinne, 20);
        System.out.println("5. Kurs-Gewinn-Verhältnis über 5 Jahre: " + kgv);
        levermann = kgvBewertung(kgv);
        System.out.println("Levermannwertung: " + levermann);
    }

    //berechnet die Eigenkapitalrendite
    public static float kursGewinnVerhältnis(float[] gewinne, float aktKurs){
        float kgv;
        kgv = aktKurs / ((gewinne[0] + gewinne[1] + gewinne[2] + gewinne[3] + gewinne[4])/(float)5);
        return kgv;
    }

    //berechne die Levermannwertung für die gegebene Eigenkapitalrendite
    public static int kgvBewertung(float kgv){
        int retval1, retval2, retval3;
        float upperLimit = (float)16.0;
        float lowerLimit = (float)12.0;

        retval1 = Float.compare(kgv, upperLimit);
        retval2 = Float.compare(kgv, (float)0.0);
        retval3 = Float.compare(kgv, lowerLimit);
        if (retval3 < 0 && retval2 > 0){
            return 1;
        }else if(retval2 < 0 || retval1 > 0){
            return -1;
        }else{
            return 0;
        }
    }
}
