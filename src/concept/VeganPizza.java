/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package concept;

/**
 *
 * @author sannan bin eizaz
 */
public class VeganPizza extends Pizza implements IPizza{
String flavour="Vegan";

    public VeganPizza(boolean sause, String base, String cheese) {
        super(sause, base, cheese);
    }

   public String getFlavour()
    {
          return "vegan";
    }
public double getPrice(){
    return 9.0;
}

}
