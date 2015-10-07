package com.mike.stuart;

import java.io.*;
import java.net.*;

/**
 * Created by Mike on 9/29/2015.
 * I'm not quite understanding this. I think there is a problem with the readStream() method. This is incomplete and
 * I'll go figure out more of what it does and how it works.
 * This is where I'm getting most of the data
 * http://developer.android.com/reference/java/net/HttpURLConnection.html
 */
public class urlConnectionClass {

    public static void main(String args[]) {

        HttpURLConnection urlConnection = null;
        try {
            URL url = new URL("http://www.android.com/");
            urlConnection = (HttpURLConnection) url.openConnection();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            InputStream in = new BufferedInputStream(urlConnection.getInputStream());
            readStream(in);
        } finally {
            urlConnection.disconnect();
        }
    }
}
