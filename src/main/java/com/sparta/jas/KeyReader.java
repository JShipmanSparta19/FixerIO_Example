package com.sparta.jas;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class KeyReader {
    private String apiKey;

    public KeyReader(){
        Properties appProps = new Properties();
        try {
            appProps.load(new FileReader("resources/app.properties"));
            apiKey = appProps.getProperty("api_key");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getApiKey() {
        return apiKey;
    }
}
