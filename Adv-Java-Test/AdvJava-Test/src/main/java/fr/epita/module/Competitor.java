package fr.epita.module;

import javax.persistence.*;

@Entity
@Table(name = "QUESTIONS")
public class Competitor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "family_name_white")
    private String familyName;
    @Column(name = "given_name_white")
    private String givenName;
    @Column(name = "country_white")
    private String country;
    @Column(name = "weight")
    private Integer weight;
    @Column(name = "age")
    private Integer age;

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

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Competitor{" +
                "familyName='" + familyName + '\'' +
                ", givenName='" + givenName + '\'' +
                ", country='" + country + '\'' +
                ", weight=" + weight +
                ", age=" + age +
                '}';
    }
}
