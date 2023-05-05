/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animales;

/**
 *
 * @author renii
 */
public class Perro extends AnimalTerrestre{
    private String collar;

    public Perro() {
    }

    public Perro(String nombre, String lugarOrigen, String color, int numeroPatas,String collar) {
        super(nombre, lugarOrigen, color, numeroPatas);
        this.collar = collar;
    }

    public String getCollar() {
        return collar;
    }

    public void setCollar(String collar) {
        this.collar = collar;
    }
    public void hacerTrucos(){
        System.out.println("Checate este truco");
    }

    @Override
    public String toString() {
        return super.toString()+"Este animal es un perro con un collar de color "+ collar + ".";
    }
    
    
    
    
    
    
}
