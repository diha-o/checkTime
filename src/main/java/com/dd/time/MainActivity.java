package com.dd.time;


/**
 * dd pc
 *
 */
public class MainActivity
{

    public static void main( String[] args )
    {
        CheckTimeHelper checkTimeHelper = new CheckTimeHelper();
        int time = checkTimeHelper.getCurrentTime(); // get current time

        try {
            new check_time_form(checkTimeHelper.getCurrentText(time)); // creating form
        } catch (Exception e) {
            e.printStackTrace();
            System.out.print("\n" + checkTimeHelper.getCurrentText(time));
        }
    }
}
