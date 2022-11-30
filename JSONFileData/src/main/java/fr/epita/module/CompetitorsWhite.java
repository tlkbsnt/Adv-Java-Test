package fr.epita.module;

import java.util.Objects;

public class CompetitorsWhite {
    private String familyName;
    private String givenName;
    private String country;
    private String weightCategory;
    private String ageCategory;

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getWeightCategory() {
        return weightCategory;
    }

    public void setWeightCategory(String weightCategory) {
        this.weightCategory = weightCategory;
    }

    public String getAgeCategory() {
        return ageCategory;
    }

    public void setAgeCategory(String ageCategory) {
        this.ageCategory = ageCategory;
    }

    @Override
    public String toString() {
        return "\n{" +
                "familyName: '" + familyName + '\'' +
                ", givenName: '" + givenName + '\'' +
                ", country: '" + country + '\'' +
                ", weightCategory: '" + weightCategory + '\'' +
                ", ageCategory: '" + ageCategory+
                '}';
    }

}
