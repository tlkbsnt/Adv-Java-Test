package fr.epita.module;

public class CompetitorsBlue {
       /*
        public String id_competition;
        public String id_fight;
        public String id_person_blue;
        public String id_person_white;
        public String id_winner;
        public String is_finished;
        public String round;
        public String duration;
        public String ippon;
        public String waza;
        public String yuko;
        public String penalty;
        public String ippon_b;
        public String waza_b;
        public String yuko_b;
        public String penalty_b;
        public String ippon_w;
        public String waza_w;
        public String yuko_w;
        public String penalty_w;
        public String type;
        public String round_code;
        public String round_name;
        public String date_start_ts;
        public String first_hajime_at_ts;
        public String gs;
        public String bye;
        public String updated_at;
        public String hsk_w;
        public String hsk_b;
        public String tagged;
        public String kodokan_tagged;
        public String published;
        public String sc_countdown_offset;
        public String fight_no;
        public String contest_code_long;
        public String mat;
        public String competition_name;
        public String competition_date;
        public String external_id;
        public String city;
        public String comp_year;
        public String fight_duration;
        public String id_weight;
        public String date_raw;
        public String person_white;
        public String id_ijf_white;
        public String timestamp_version_white;
        public String person_blue;
        public String id_ijf_blue;
        public String timestamp_version_blue;
        public String country_short_white;
        public String id_country_white;
        public String country_short_blue;
        public String id_country_blue;
        public String picture_folder_1;
        public String picture_filename_1;
        public String picture_folder_2;
        public String picture_filename_2;
        public String media;
        public String rank_name;
        public String personal_picture_white;
        public String personal_picture_blue;
*/
    /*
        Family Name
	    Given Name
	    Country
	    Weight Category (weight category)
	    Age Category
     */
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
        return "\n { "+
                "familyName: " + familyName + '\'' +
                ", givenName: " + givenName + '\'' +
                ", country: " + country + '\'' +
                ", weightCategory: '" + weightCategory +
                ", ageCategory: " + ageCategory +
                '}';
    }
}
