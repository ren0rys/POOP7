/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animales;

/**
 *
 * @author renii
 */
public class AnimalTerrestre extends Animal{
    private int numeroPatas;

    public AnimalTerrestre() {
    }

    public AnimalTerrestre(String nombre, String lugarOrigen, String color,int numeroPatas) {
        super(nombre, lugarOrigen, color);
        this.numeroPatas = numeroPatas;
    }

    public int getNumeroPatas() {
        return numeroPatas;
    }

    public void setNumeroPatas(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }
    public void correr(){
        System.out.println("Estoy corriendo");
    }
    public void comer(){
        System.out.println("Estoy comiendo");
    }

    @Override
    public String toString() {
        return super.toString()+"Este animal terrestre tiene " + numeroPatas + " patas. ";
    }
    
    
    
    
    
    
}
