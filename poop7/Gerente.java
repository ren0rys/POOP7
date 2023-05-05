/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop7;
//la clase  gerente hereda del empleado
public class Gerente extends Empleado{
    private int presupuesto;
    public Gerente() {
    }
    //sus getter y setters se heredan de la clase padre más sus atributos propios
    public Gerente(String nombre, int numEmpleado, int sueldo, int presupuesto){
            super(nombre, numEmpleado, sueldo);
    this.presupuesto = presupuesto;
    }
    public int getPresupuesto() {
        return presupuesto;
    }
    public void setPresupuesto(int presupuesto) {
        this.presupuesto = presupuesto;
    }
    //se le agrega su método propio
    public void asignarPresupuesto(){
        presupuesto = getSueldo() * 10;
    }
    //se sobre escribe los atributos de padre mas los del hijo
    @Override
    public String toString() {
        return super.toString()+" Ahora es Gerente con un presupuesto de $"+ presupuesto + ".";
    }
}
