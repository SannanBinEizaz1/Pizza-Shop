/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package concept;

/**
 *
 * @author sannan bin eizaz
 */
public class PepproniPizza extends Pizza implements IPizza {
	String flavour = "Pepproni";

	public PepproniPizza(boolean sause, String base, String cheese) {
		super(sause, base, cheese);
	}

	public String getFlavour() {
		return "Pepproni";
	}

	public double getPrice() {
		return 12.0;
	}

}
