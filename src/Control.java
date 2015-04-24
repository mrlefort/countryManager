
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
public class Control {
    FileHandler fh = new FileHandler();
    
    
    public List<Criteria> getCriteria() {
        return fh.readCriteria();
    }
    public List<Country> getCountries() {
        return fh.readCountries();
    }
}
