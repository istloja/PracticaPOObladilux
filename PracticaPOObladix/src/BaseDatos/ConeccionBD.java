/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaseDatos;


import com.db4o.Db4o;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;

/**
 *
 * @author SOFT06
 */
public class ConeccionBD {
    private ObjectContainer ob;
//Creando un objeto Contenedor
    public  ConeccionBD(String dataBase) {
        this.ob=Db4o.openFile(dataBase);
    }
    
        public void agregarEstudiante(Estudiante estudiante){
        ob.store(estudiante);
        System.out.println("EstudianteAlmacenado" + estudiante);
    }
    
    public void eliminarEstudiantes(String cedula){
        
        ObjectSet objectSet = ob.queryByExample(new Estudiante(cedula));
        if (objectSet.hasNext()) {
            Estudiante e =(Estudiante)objectSet.next();
            ob.delete(e);
            System.out.println("Estudiante eliminado");
        } else {
            System.out.println("No hay datos para eliminar");
        }
        Estudiante e=(Estudiante)objectSet.next();
        ob.delete(e);
        System.out.println("Estudiante eliminado");
    }
      public void updateEstudiante(Estudiante eModificado){
        ObjectSet objectSet = ob.queryByExample(eModificado.getDni());
        Estudiante e=(Estudiante) objectSet.next();
        e=eModificado;
        ob.store(e);
        System.out.println("Estudiante actualizado");
    }
    public void updateEstudianteporNombre(Estudiante eModificado){
        ObjectSet objectSet = ob.queryByExample(eModificado.getNombre());
        Estudiante e=(Estudiante) objectSet.next();
        e=eModificado;
        ob.store(e);
        System.out.println("Estudiante actualizado");
    }
    public  Estudiante traerUnEstudiante(String cedula) {
       
        ObjectSet objectSet = ob.queryByExample(new Estudiante(cedula));
        if(objectSet.hasNext()){
             return (Estudiante)objectSet.next();
        }
        System.out.println("no hay estudiantes");
         
        return null;
    }
    
        public void traerEstudiantes(ObjectSet result,String cedula) {
            Estudiante estudiante=new Estudiante(null);
             ObjectSet objectSet = ob.queryByExample(new Estudiante(cedula));
      
        while (objectSet.hasNext()) {
            System.out.println(objectSet.next());
            System.out.println("\n_____________\n");

        }
    }
        public void cerrarConeccion(){
            ob.close();
        }
}
