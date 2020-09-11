package services;

import com.fasterxml.jackson.databind.ObjectMapper;
import entitys.City;
import info.debatty.java.stringsimilarity.Levenshtein;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class CityServices {
    public List<String> getCitiesByInputString(String input) throws IOException {
        List<String> listCity = new ArrayList<String>();
        Levenshtein levenshtein= new Levenshtein();
        ObjectMapper objectMapper=new ObjectMapper();
        URL url=new URL("https://raw.githubusercontent.com/lutangar/cities.json/master/cities.json");

        City[] cities=objectMapper.readValue(url,City[].class);
        for (City c:cities
        ) {
            if(c.getCountry().equals("ID")&&levenshtein.distance(c.getName(),input)<=5){
                listCity.add(c.getName());
            }
        }

        return listCity;
    }
}
