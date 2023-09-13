/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concept;

/**
 *
 * @author sanna
 */
public class MargaritaPizza extends Pizza implements IPizza{
    
    public MargaritaPizza(boolean sause, String base, String cheese) {
        super(sause, base, cheese);
    }
    
       public String getFlavour()
    {
          return "Margarita";
    }
public double getPrice(){
    return 8.0;
}
    
}
