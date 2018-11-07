package com.sparta.jas;

import org.json.simple.JSONObject;

public class FixerLatestRatesParser {
    JSONObject rates;

    public FixerLatestRatesParser(){
        FixerHTTPManager fixerHTTPManager = new FixerHTTPManager();
        JSONFactory jsonFactory = new JSONFactory();

        fixerHTTPManager.setLatestRates();
        jsonFactory.setLatestRatesJSON(fixerHTTPManager.getLatestRates());

        rates = jsonFactory.getLatestRatesJSON();
    }

    private Object getJSONValue(String key){
        return rates.get(key);
    }

    public String getJSONSuccess(){
        return getJSONValue("success").toString();
    }

    public long getTimestamp(){
        return (Long) getJSONValue("timestamp");
    }

    public String getBaseCurrency(){
        return getJSONValue("base").toString();
    }

    public String getDate(){
        return getJSONValue("date").toString();
    }

    public JSONObject getRatesOnly() {
        return (JSONObject) getJSONValue("rates");
    }

    public JSONObject getRates() {
        return rates;
    }
}
