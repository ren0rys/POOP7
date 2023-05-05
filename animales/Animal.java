/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animales;
/**
 *
 * @author renii
 */
public class Animal {
    private String nombre;
    private String lugarOrigen;
    private String color;

    public Animal() {
    }

    public Animal(String nombre, String lugarOrigen, String color) {
        this.nombre = nombre;
        this.lugarOrigen = lugarOrigen;
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public String getLugarOrigen() {
        return lugarOrigen;
    }

    public String getColor() {
        return color;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setLugarOrigen(String lugarOrigen) {
        this.lugarOrigen = lugarOrigen;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Este animal se llama " + nombre + ", con lugar de origen en " + lugarOrigen + ", y es de color " + color + ". ";
    }
    
    public void sonido(String sonido){
        System.out.println(sonido);
    }
}

