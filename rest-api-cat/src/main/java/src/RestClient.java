package src;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class RestClient {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://cat-fact.herokuapp.com/facts/random");

        InputStreamReader inputStreamReader = new InputStreamReader(url.openStream());

    }
}
