/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package concept;

/**
 *
 * @author sannan bin eizaz
 */
public class Pizza implements IPizza {


boolean sause;
String Base,Cheese;


public Pizza(boolean sause,String base,String cheese)
{
         this.Base=base;
         this.Cheese=cheese;
         this.sause=sause;
} 
    
    public boolean isSause() {
        return sause;
    }

    public void setSause(boolean sause) {
        this.sause = sause;
    }

    public String getBase() {
        return Base;
    }

    public void setBase(String Base) {
        this.Base = Base;
    }

    public String getCheese() {
        return Cheese;
    }

    public void setCheese(String Cheese) {
        this.Cheese = Cheese;
    }

    @Override
    public double getPrice() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getFlavour() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
