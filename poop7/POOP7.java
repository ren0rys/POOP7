/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop7;
import animales.Animal;
import animales.AnimalAcuatico;
import animales.Ballena;
import animales.AnimalTerrestre;
import animales.Perro;
import animales.AnimalAereo;
import animales.Pajaro;
/**
 *
 * @author renii
 */
public class POOP7 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Empleado empleado = new Empleado("Ruben",112233, 25000);
        System.out.println(empleado);
        
        Gerente gerente = new Gerente("Ramon", 112231, 50000,0);
        System.out.println(gerente);
        System.out.println(gerente.getNombre());
        System.out.println(gerente.getNumEmpleado());
        
        System.out.println("############# IS-A (Es un) #############");
        
        if(gerente instanceof Gerente){
            System.out.println("Instancia de Gerente");
        } if(gerente instanceof Empleado){
            System.out.println("N2 Instacia de Empleado");
        } if(gerente instanceof Object){
            System.out.println("N3 Instancia de Object");
        }
        
        System.out.println("########## ANIMALES ##########");
        Animal animal = new Animal("Juan", "Selva","Azul");
        System.out.println(animal);
        
        System.out.println("######## ANIMAL ACUATICO ##########");
        AnimalAcuatico animalacuatico = new AnimalAcuatico("jose","lago","gris",5);
        System.out.println(animalacuatico);
        
        System.out.println("######## BALLENA ##########");
        Ballena ballena = new Ballena("MobyDick","oceano","azul fuerte",4,10);
        System.out.println(ballena);
        
        System.out.println("######## ANIMAL TERRESTRE ##########");
        AnimalTerrestre animalterrestre = new AnimalTerrestre("Carla","desierto","verde",4);
        System.out.println(animalterrestre);
        
        System.out.println("######## PERRO ##########");
        Perro perro = new Perro("Apolo","departamento","cafe",4,"rosa");
        System.out.println(perro);
        
        System.out.println("######## ANIMAL AEREO ##########");
        AnimalAereo animalaereo = new AnimalAereo("Chispi","granja","amarillo",2);
        System.out.println(animalaereo);
        
        System.out.println("######## PAJARO ##########");
        Pajaro pajaro = new Pajaro("Tomasa","campo","naranja",2,"corto");
        System.out.println(pajaro);
    }
}
