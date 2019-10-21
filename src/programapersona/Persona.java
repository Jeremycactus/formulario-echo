/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programapersona;

/**
 *
 * @author Amaromix
 */
public class Persona {
    //creamos atributos de persona
    String nombre;
    String apellido;
    String correo;
    String cargoOcupacional;
    int edad;

    public Persona() {
        this.nombre = "";
        this.apellido = "";
        this.correo = "";
        this.cargoOcupacional = "";
        this.edad = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCargoOcupacional() {
        return cargoOcupacional;
    }

    public void setCargoOcupacional(String cargoOcupacional) {
        this.cargoOcupacional = cargoOcupacional;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
}
