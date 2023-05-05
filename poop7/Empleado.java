/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop7;

public class Empleado{
    //se crean los atributos de la clase
    private String nombre;
    private int numEmpleado;
    private int sueldo;
    //se crean un cosntructor vacío de la clase
    public Empleado() {
    }
    //se crean los atributos de la clase
    public Empleado(String nombre, int numEmpleado, int sueldo) {
        this.nombre = nombre;
        this.numEmpleado = numEmpleado;
        this.sueldo = sueldo;
    }
    //se agregó el código para obtener los valores de los atibutos privados fuera de la clase
    public String getNombre() {
        return nombre;
    }
    public int getNumEmpleado() {
        return numEmpleado;
    }
    public int getSueldo() {
        return sueldo;
    }
    //también se agregan los setter para asignarle valor a los atributos
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setNumEmpleado(int numEmpleado) {
        this.numEmpleado = numEmpleado;
    }
    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }
    //se agregan las funciones que pueden realizar los objetos de esta clase
    public void aumentarSueldo(int porcentaje){
        sueldo += sueldo * porcentaje / 100;
    }
    public void trabajar(){
            System.out.println("Estoy trabajando");
    }
    //se agrega override para indicar que un método está sobrescribiendo un método de una clase padre
    @Override
    public String toString() {
        return super.toString()+"El empleado " + nombre + ", tiene el numero de empleado " + numEmpleado + ", con un sueldo de $" + sueldo + ".";
    }
    
    
}
