/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animales;

/**
 *
 * @author renii
 */
public class AnimalAereo extends Animal{
    private int numeroAlas;

    public AnimalAereo() {
    }

    public AnimalAereo(String nombre, String lugarOrigen, String color,int numeroAlas) {
        super(nombre, lugarOrigen, color);
        this.numeroAlas = numeroAlas;
    }

    public int getNumeroAlas() {
        return numeroAlas;
    }

    public void setNumeroAlas(int numeroAlas) {
        this.numeroAlas = numeroAlas;
    }
    public void volar(){
        System.out.println("Estoy volando");
    }
    public void comer(){
        System.out.println("Estoy comiendo");
    }

    @Override
    public String toString() {
        return super.toString()+"Este animal tiene "+ numeroAlas + " alas. ";
    }
    
}
