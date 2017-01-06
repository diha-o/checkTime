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
        new check_time_form(checkTimeHelper.getCurrentText(time)); // creating form
    }
}
