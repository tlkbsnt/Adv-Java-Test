package fr.epita.services;

import fr.epita.module.CompetitorsBlue;
import fr.epita.module.CompetitorsWhite;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CompetitorsDAO {
    Set<String> competitorsBlueSet = new HashSet<>();
    Set<String> competitorsWhiteSet = new HashSet<>();
    public void readData() {

        //Create the JSONParser
        JSONParser jsonParser = new JSONParser();
        //Read the JSON File
        try(FileReader fileReader = new FileReader("contest-tokyo-grand-slam-2017 1.json")){
            // Parse JSON file to java object
            Object obj = jsonParser.parse(fileReader);

            //Convert Java Object to JSON object
            JSONObject jsonObject = (JSONObject) obj;

           //Convert JSONObject to array object
            JSONArray jsonArray = (JSONArray) jsonObject.get("Contests");



            int i=0;
            while (i<jsonArray.size()) {
                CompetitorsBlue competitorsBlue  = new CompetitorsBlue();
                CompetitorsWhite competitorsWhite = new CompetitorsWhite();
                JSONObject jsonContest = (JSONObject) jsonArray.get(i);

                String familyName;
                String givenName;
                String country;
                String weightCategory;
                String ageCategory;

                //Start Setting Blue competitors data
                familyName = (String) jsonContest.get("family_name_blue");
                competitorsBlue.setFamilyName(familyName);

                givenName = (String) jsonContest.get("given_name_blue");
                competitorsBlue.setGivenName(givenName);

                country = (String) jsonContest.get("country_blue");
                competitorsBlue.setCountry(country);

                weightCategory = (String) jsonContest.get("weight");
                competitorsBlue.setWeightCategory(weightCategory);

                ageCategory = (String) jsonContest.get("age");
                competitorsBlue.setAgeCategory(ageCategory);
                //End Setting Blue Competitors Data
                //System.out.println(competitorsBlue.toString());
                competitorsBlueSet.add(competitorsBlue.toString());

                //Start Setting White competitors data
                familyName = (String) jsonContest.get("family_name_white");
                competitorsWhite.setFamilyName(familyName);

                givenName = (String) jsonContest.get("given_name_white");
                competitorsWhite.setGivenName(givenName);

                country = (String) jsonContest.get("country_white");
                competitorsWhite.setCountry(country);

                weightCategory = (String) jsonContest.get("weight");
                competitorsWhite.setWeightCategory(weightCategory);

                ageCategory = (String) jsonContest.get("age");
                competitorsWhite.setAgeCategory(ageCategory);
                //End Setting White competitors data

                //System.out.println(competitorsWhite.toString());
                //competitorsWhiteSet.add(competitorsWhite.toString());

                i++;
               // System.out.print(competitorsBlueSet);
            }

        } catch (IOException | ParseException e) {
            throw new RuntimeException(e);
        }
        System.out.print(competitorsBlueSet);
        System.out.println(competitorsWhiteSet);

    }

}
