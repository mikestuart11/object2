package mike.stuart.URLConnection;

import org.quickconnectfamily.json.JSONException;
import org.quickconnectfamily.json.JSONInputStream;
import org.quickconnectfamily.json.JSONOutputStream;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by Mike on 11/23/2015.
 */
public class URLconnectionSandbox {

    /**
     * Created by Mike on 9/29/2015.
     */
    public static void main(String args[]) {

        URLconnectionSandbox connectNow = new URLconnectionSandbox();
        connectNow.go();

    }

    private void go() {

        while (true) {

            try {
                Scanner systemInScanner = new Scanner(System.in);
                System.out.printf("Enter the message to send to the server.\n");
                String messageForServer = systemInScanner.nextLine();

                /*******************************************************************************************************
                 * Happy Path Connection
                 * This connects to my Tomcat server. This is the client side.
                 * *****************************************************************************************************/

                URL url = new URL("http://localhost:8080/json");
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                connection.setDoOutput(true);//allows POST
                JSONOutputStream outToServer = new JSONOutputStream(connection.getOutputStream());

                /*******************************************************************************************************
                * These are my nasty paths for Connections
                * They are:
                * ----------
                * URL Empty String
                * URL Null
                * URL Busy Server
                * No connection to the server
                * URL Called Twice
                * *****************************************************************************************************/

                // URL Empty String
                // ERROR: java.net.MalformedURLException: no protocol:
                URL urlEmpty = new URL("");
                HttpURLConnection emptyStringConnection = (HttpURLConnection) urlEmpty.openConnection();
                emptyStringConnection.setDoOutput(true);
                JSONOutputStream outToServerTwo = new JSONOutputStream(emptyStringConnection.getOutputStream());

                // URL Null
                // ERROR: java.net.MalformedURLException
                String nullURLString = null;
                URL nullURL = new URL(nullURLString);
                HttpURLConnection nullURLConnection = (HttpURLConnection) nullURL.openConnection();
                nullURLConnection.setDoOutput(true);
                JSONOutputStream outToServerThree = new JSONOutputStream(nullURLConnection.getOutputStream());

                // URL Busy Server
                // ERROR: java.net.ConnectException: Connection timed out: connect
                URL busyServerURL = new URL("http://www.google.com:81");
                HttpURLConnection busyServerConnection = (HttpURLConnection) busyServerURL.openConnection();
                busyServerConnection.setDoOutput(true);//allows POST
                JSONOutputStream outToServerFour = new JSONOutputStream(busyServerConnection.getOutputStream());

                // No connection to the Server
                // ERROR: java.net.ConnectException: Connection refused: connect
                URL serverOffURL = new URL("http://localhost:8080/json");
                HttpURLConnection serverOffConnection = (HttpURLConnection) serverOffURL.openConnection();
                serverOffConnection.setDoOutput(true);//allows POST
                JSONOutputStream outToServerFive = new JSONOutputStream(serverOffConnection.getOutputStream());

                // URL Called Twice
                // No error but says that this is redundant
                URL calledTwiceURL = new URL("http://localhost:8080/json");
                    calledTwiceURL = new URL("http://localhost:8080/json");
                HttpURLConnection calledTwiceConnection = (HttpURLConnection) calledTwiceURL.openConnection();
                calledTwiceConnection.setDoOutput(true);//allows POST
                // Go out and interact with the URL given, this line is CRITICAL to make it talk to the outside world
                JSONOutputStream outToServerSix = new JSONOutputStream(calledTwiceConnection.getOutputStream());

                /*******************************************************************************************************
                * Response Code to Show the reply from the Server...
                * *****************************************************************************************************/

                HashMap<String, Object> request = new HashMap<>();
                request.put("command", "Speak");
                request.put("message", messageForServer);

                outToServer.writeObject(request);


                JSONInputStream inFromServer = new JSONInputStream(connection.getInputStream());
                HashMap<String, Object> response = (HashMap<String, Object>) inFromServer.readObject();

                if (response.get("command").equals("Done")) {
                    System.out.println("Sent request: " + request + "and  got response  " + response);
                } else {
                    System.out.println("Oops. got " + response);
                }
            } catch (IOException e) {
                e.printStackTrace();
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }
}


