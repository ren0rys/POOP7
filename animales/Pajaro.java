/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animales;

/**
 *
 * @author renii
 */
public class Pajaro extends AnimalAereo{
    private String tipoPico;

    public Pajaro() {
    }

    public Pajaro(String nombre, String lugarOrigen, String color, int numeroAlas,String tipoPico) {
        super(nombre, lugarOrigen, color, numeroAlas);
        this.tipoPico = tipoPico;
    }

    public String getTipoPico() {
        return tipoPico;
    }

    public void setTipoPico(String tipoPico) {
        this.tipoPico = tipoPico;
    }
    public void recolectarRamas(){
        System.out.println("Recojo ramas para mi nido");
    }

    @Override
    public String toString() {
        return super.toString()+"Este pajaro tiene el pico " + tipoPico + ".";
    }
    
    
    
}
