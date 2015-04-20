
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Steffen
 */
public class FileHandler {
    List<Criteria> criteria;
    
    String[] stumper;
    
    public FileHandler(){
        criteria = new ArrayList();
        
       
        
        
    }
    
    /**
     *
     * @return
     */
    public List<Criteria> readCriteria() {
        try {
            Scanner scan = new Scanner(new File("Criteria.txt"));
            while (scan.hasNext()){
                String line = scan.nextLine();
                
                String[] stumper = line.split(", ");
                String name = stumper[0];
                int weight = Integer.parseInt(stumper[1]);
                
                Criteria c = new Criteria(name, weight);
                criteria.add(c);
                
                
            
            }
           
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } 
        
        return criteria;
        
    }
    
//    public String[] getStumper() {
//        
//        try {
//            Scanner scan = new Scanner(new File("Criteria.txt"));
//            while (scan.hasNext()){
//                String line = scan.nextLine();
//                
//                String[] stumper = line.split(", ");
//                String name = stumper[0];
//                String weight = stumper[1];
//                
//                Criteria p = new Criteria(name, weight);
//                stumper.add(p);
//                
//                
//              
//            
//            }
//            
//            
//        } catch (FileNotFoundException ex) {
//            Logger.getLogger(FileHandler.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        System.out.println(stumper);
//        return stumper;
//        
//        
//    }
           
      
        
        
    
    
}
    
