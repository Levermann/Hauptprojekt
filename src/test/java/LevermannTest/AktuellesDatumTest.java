package LevermannTest;


import com.mycompany.demo.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Landb
 */
public class AktuellesDatumTest {
    static void printGregorianCalendarDate() {
        GregorianCalendar now = new GregorianCalendar();
        DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT);   // 14.04.12
        df = DateFormat.getDateInstance(DateFormat.MEDIUM);             // 14.04.2012
//        df = DateFormat.getDateInstance(DateFormat.LONG);               // 14. April 2012
//        System.out.println(df.format(now.getTime()));
//        df = DateFormat.getTimeInstance(DateFormat.SHORT);              // 21:21
//        df = DateFormat.getTimeInstance(DateFormat.MEDIUM);             // 21:21:12
//        df = DateFormat.getTimeInstance(DateFormat.LONG);               // 21:21:12 MESZ
//        System.out.println(df.format(now.getTime()));
//        df = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.LONG); // 14.04.12 21:34:07 MESZ
        System.out.println(df.format(now.getTime())); 
        }
    
    
    
        static void printSimpleDateFormat() {
        SimpleDateFormat formatter = new SimpleDateFormat(
                "yyyy.MM.dd - HH:mm:ss ");
        Date currentTime = new Date();
        System.out.println(formatter.format(currentTime));        // 2012.04.14 - 21:34:07 
    } 
        
        
}
