/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animales;

/**
 *
 * @author renii
 */
public class Ballena extends AnimalAcuatico{
    private int largo;

    public Ballena() {
    }

    public Ballena(String nombre, String lugarOrigen, String color, int numeroAletas,int largo) {
        super(nombre, lugarOrigen, color, numeroAletas);
        this.largo = largo;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }
    public void pelearConPinocho(){
        System.out.println("estoy peleando con Pinocho");
    }

    @Override
    public String toString() {
        return super.toString()+"Este animal es una ballena que mide " + largo + " metros de largo";
    }
    
    
    
}
