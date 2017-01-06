package com.dd.time;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by User on 04.01.2017.
 */
public class CheckTimeHelper {

    private static final DateFormat sdf = new SimpleDateFormat("HH");//HH:mm // just in hours
    private int time = -1;

    public int getCurrentTime(){

        Date date = new Date();

        try {

            time = Integer.parseInt(sdf.format(date));
            print("Current hour is: "+sdf.format(date)); // seen not parsing time

        } catch (Exception e){
            print("Can't get time // getCurrentTime method");
        }

        return time; // if time -1 need get error string in main class
    }

    public String getCurrentText(int cTime){

        try {

        String returnText = "";
        ResourceBundle bundle = getLocale();


    if (cTime >= 6 && cTime < 9) {
        returnText = bundle.getString("good.morning.world");
        print(bundle.getString("good.morning.world"));

    } else if (cTime >= 9 && cTime < 19) {
        returnText =bundle.getString("good.day.world");
        print(bundle.getString("good.day.world"));

    } else if (cTime >= 19 && cTime <= 23) {
        returnText=bundle.getString("good.evening.world");
        print(bundle.getString("good.evening.world"));

    } else if (cTime >= 0 && cTime < 6) {
        returnText=bundle.getString("good.night.world");
        print(bundle.getString("good.night.world"));

    } else {
        returnText="Sometsing wrong in getCurrentText";
        print("Sometsing wrong in getCurrentText");

    }
    return returnText;
}catch (Exception e){ return "Exception in getCurrentText";}

    }

    private ResourceBundle getLocale(){
        Locale defaultLocale;
        ResourceBundle bundleDefault;
        try {
            defaultLocale = Locale.getDefault();
            bundleDefault = ResourceBundle.getBundle("textToForm", defaultLocale);

            print("getLocation ---" +  bundleDefault.getLocale().getDisplayLanguage());

            return bundleDefault;
        }catch (Exception e){
            defaultLocale = new Locale("en", "US", "WIN");
            bundleDefault = ResourceBundle.getBundle("textToForm", defaultLocale);
            print(e.getMessage());return bundleDefault;

        }

    }


    private void print(String print){
        System.out.print("--- CheckTimerHelper say to you --- \n" + print +" \n\n" );
    }
}
