package com.sedin.workbookrealm;


import java.text.SimpleDateFormat;

/**
 * Created by sriman on 29/03/16.
 */
public class AppConstants {

    public static final int SPLASH_TIME = 3000;

    public static final String SHARED_DATA = "SHARED_DATA";

    public static final String BASE_URL = "http://eam360-dev.herokuapp.com/";

    public static String DISPLAY_DATE = "dd/MM/yyyy";


    public static final SimpleDateFormat SERVICE_TIMEFORMAT = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm");
    public static final SimpleDateFormat SERVICE_DATEFORMAT = new SimpleDateFormat("yyyy-MM-dd");
    public static final SimpleDateFormat DISPLAY_DATETIMEFORMAT = new SimpleDateFormat("dd/MM/yyyy HH:mm");
    public static final SimpleDateFormat DISPLAY_DATEFORMAT = new SimpleDateFormat("dd/MM/yyyy");
    public static final SimpleDateFormat DISPLAY_TIMEFORMAT = new SimpleDateFormat("HH:mm");

}
