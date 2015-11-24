package com.mike.stuart.URLConnection;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by Mike on 11/23/2015.
 */
public class URLconnectionSandbox {

/**
 * Created by Mike on 9/29/2015.
 * I'm not quite understanding this. I think there is a problem with the readStream() method. This is incomplete and
 * I'll go figure out more of what it does and how it works.
 * This is where I'm getting most of the data
 * http://developer.android.com/reference/java/net/HttpURLConnection.html
 */

    public static void main(String args[]) {

        HttpURLConnection urlConnection = null;
        try {
            URL url = new URL("http://www.android.com/");
            urlConnection = (HttpURLConnection)url.openConnection();
        } catch (IOException e) {
            e.printStackTrace();
        }


        try {
            InputStream in = new BufferedInputStream(urlConnection.getInputStream());
            System.out.println(in);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            urlConnection.disconnect();
        }



    }
}

