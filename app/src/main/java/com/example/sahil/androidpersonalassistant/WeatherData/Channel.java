package com.example.sahil.androidpersonalassistant.WeatherData;

/*
 * referred from : https://www.youtube.com/watch?v=FkT1kwtYSFU
 * referred from : https://www.youtube.com/watch?v=dUKJN_KCK6U
 * referred from : https://www.youtube.com/watch?v=gJ9Ny_J3tcM
 *
 */
import org.json.JSONObject;

/**
 * Created by SAHIL on 08-04-2017.
 */

public class Channel implements JSONPopulatorClass {
    Item item;
    Units units;

    @Override
    public void populate(JSONObject jsonObject) {
        item = new Item();
        item.populate(jsonObject.optJSONObject("item"));

        units = new Units();
        units.populate(jsonObject.optJSONObject("units"));
    }

    public Item getItem() {
        return item;
    }

    public Units getUnits() {
        return units;
    }
}
