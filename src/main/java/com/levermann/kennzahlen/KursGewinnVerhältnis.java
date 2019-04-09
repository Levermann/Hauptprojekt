package com.levermann.kennzahlen;

public class KursGewinnVerhältnis {
    public static void main(String[] args) {
        float kgv;
        int levermann;
        kgv = kursGewinnVerhältnis(20, 1);
        System.out.println("4. Kurs-Gewinn-Verhältnis: " + kgv);
        levermann = kgvBewertung(kgv);
        System.out.println("Levermannwertung: " + levermann);
    }

    //berechnet die Eigenkapitalrendite
    public static float kursGewinnVerhältnis(float aktKurs, float geschGewinn){
        float kgv;
        kgv = aktKurs / geschGewinn;
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
