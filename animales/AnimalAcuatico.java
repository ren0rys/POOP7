/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animales;

/**
 *
 * @author renii
 */
public class AnimalAcuatico extends Animal{
    private int numeroAletas;

    public AnimalAcuatico() {
    }

    public AnimalAcuatico(String nombre, String lugarOrigen, String color,int numeroAletas) {
        super(nombre, lugarOrigen, color);
        this.numeroAletas = numeroAletas;
    }
    
    

    public void setNumeroAletas(int numeroAletas) {
        this.numeroAletas = numeroAletas;
    }

    public void nadar(){
        System.out.println("Estoy nadando");
    }
    
    public void comer(){
        System.out.println("Estoy comiendo");
    }
    
    @Override
    public String toString(){
        return super.toString()+" Este animal acuatico tiene " + numeroAletas + " aletas. ";
    }
    
}
