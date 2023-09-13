/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package concept;

/**
 *
 * @author sannan bin eizaz
 */
public class ChickenPizza extends Pizza implements IPizza{

    public ChickenPizza(boolean bln, String string, String string1) {
        super(bln, string, string1);
    }

    

   public String getFlavour()
    {
          return "Chicken";
    }
public double getPrice(){
    return 10.0;
}

}
