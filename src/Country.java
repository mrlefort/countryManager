
import static java.nio.file.Files.list;
import static java.rmi.Naming.list;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Steffen
 */
public class Country implements Comparable<Country>{
    
    private String country;
    private Double score;



    
    

    public Country(String country, Double score) {
        this.country = country;
        this.score = score;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }
    
 

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
   

    @Override
    public int compareTo(Country comparecon) {
        Double comp = comparecon.getScore();

        return (int) (this.score-comp);
        
    }

    
    
   
    @Override
    public String toString() {
        return String.format("%s, %s", country, score);
    }

    
 
}
