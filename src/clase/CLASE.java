/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase;

/**
 *
 * @author geo
 */
public class CLASE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {       
// TODO code application logic here

     Persona obj1 = new Persona();
       obj1.setNombre("Jorge");
       obj1.setApellido("Lloreda") ;
       obj1.setEdad(29);   
  
  System.out.println(obj1.getNombre());
  System.out.println(obj1.getApellido());
  System.out.println(obj1.getEdad());
   
  Estudiante obj2 = new Estudiante();
   
   obj2.setNombre("Rodrigo");
   obj2.setApellido("Rojas");
   obj2.setEdad(20);
   obj2.setCorreo("rrojas@cun.edu.co");
   
   System.out.println(obj2.getNombre());
   System.out.println(obj2.getApellido());
   System.out.println(obj2.getEdad());
   System.out.println(obj2.getCorreo());
   
  Docente obj3 = new Docente();
   
   obj3.setNombre("Julio");
   obj3.setApellido("Ramirez");
   obj3.setEdad(20);
   obj3.setCorreo("j.ramirez@cun.edu.co");
   obj3.setProfesor("Luis Alejandro Castañeda Varon");
   
   System.out.println(obj3.getNombre());
   System.out.println(obj3.getApellido());
   System.out.println(obj3.getEdad());
   System.out.println(obj3.getCorreo());
   System.out.println(obj3.getProfesor());
      
       }
    
}
