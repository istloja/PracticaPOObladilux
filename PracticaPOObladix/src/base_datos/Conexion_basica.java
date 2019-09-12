/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package base_datos;

import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author ISTLOJAV
 */
public class Conexion_basica {
    
    public void leer (String usuario,String clave){
        try {/// paso especifico la base con la  que base vamos a trabajar
            DriverManager.registerDriver(new org.gjt.mm.mysql.Driver());
            // conceto con la base  localhost para decir que es local /nombre de la base de datos"
            Connection variable= DriverManager.getConnection("jdbc:mysql://localhost/futbol?characterEncoding=latin1",usuario,clave);
            //comprobar que se puede co0nectar
            System.out.println(variable.getCatalog());
            // consulto los datos
            Statement variable1 = variable.createStatement();
            //aqui pongo la consulta
            ResultSet resultado=(ResultSet) variable1.executeQuery("select * from persona");
            while(resultado.next()){
                System.out.println(resultado.getString("nombre")+"  "+resultado.getString("apellido"));
            }
                        
            
        } catch (Exception e) {
            System.out.println("hubo un error"+ e);
        }
        
    }
    public static void main(String[] args) {
        Conexion_basica objeto=new Conexion_basica();
        objeto.leer("vicente", "vicente");
    }
            
    
}
