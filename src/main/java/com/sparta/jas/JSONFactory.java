package com.sparta.jas;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JSONFactory {
    private JSONObject latestRatesJSON;

    public JSONObject getLatestRatesJSON() {
        return latestRatesJSON;
    }

    public void setLatestRatesJSON(String latestRates) {
        JSONParser jsonParser = new JSONParser();
        try {
            latestRatesJSON = (JSONObject) jsonParser.parse(latestRates);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
