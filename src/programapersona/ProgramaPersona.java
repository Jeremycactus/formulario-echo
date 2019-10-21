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
public class ProgramaPersona {

    private static FrmFormulario formulario;
    private static Persona persona[];
    private static int contador;
    
    
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        formulario=new FrmFormulario();
        persona=new Persona[5];
        //arreglo para almacenar de 0 - 4 elementos
        //del arreglo persona
        
        for (int i = 0; i < 5; i++){
            
            persona[i]=new Persona();
            
            
        }
        contador=0;
        
        formulario.setVisible(true);
//ahora se crean los metodos guardar y buscar
    }
    public static void guardar( String nom, String ape, String cor, String cargo, int ed){
    //creamos la variables
    // String nombre;  String apellido; String correo; String cargoOcupacional;  int edad;
   persona[contador].setNombre(nom);
   persona[contador].setApellido(ape);
  persona[contador].setCorreo(cor);
  persona[contador].setCargoOcupacional(cargo);
  persona[contador].setEdad(ed);

    
    contador++;
    }

    public static void buscar(String bus){
        //se crea la variable
        //buscar bus
        for (int j = 0; j < persona.length; j++){
            if (persona[j].getNombre().equals(bus)){
                formulario.cargardatos(persona[j]);
            }
        }
    }



}
