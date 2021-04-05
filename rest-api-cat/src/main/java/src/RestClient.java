package src;

import com.google.gson.Gson;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class RestClient {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://cat-fact.herokuapp.com/facts/random");
        InputStreamReader inputStreamReader = new InputStreamReader(url.openStream());

        CatFact catFact = new Gson().fromJson(inputStreamReader, CatFact.class);

        System.out.println("JSON saved:\n" + catFact.toString());
        System.out.println("Print Text only:\n" + catFact.getText());
    }
}
