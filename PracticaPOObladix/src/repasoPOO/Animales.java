/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repasoPOO;

/**
 *
 * @author ist loja
 */
public class Animales {
    
    

   // constructor primero lo pones vacio para que te ponga todas las variables
    // constructor sirve para no dar valorees a muchos variables
    //con set se da valores
    // con get se los obtiene
    public Animales() {
    }

    public Animales(String nombre, double edad, double peso, String color, double altutra) {
        this.nombre = nombre;
       //gg
        
        this.peso = peso;
        this.color = color;
        this.altutra = altutra;
    }

    public Animales(double edad) {
        this.edad = edad;
    }
     // declaramos metodos
    private String nombre;
    private double edad;
    private double peso;
    private String color;
    private double altutra;
    // generamos codigo getter and setter sirve cuando queremos dar valores a pocas variables

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

   

  

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getAltutra() {
        return altutra;
    }

    public void setAltutra(double altutra) {
        this.altutra = altutra;
    }
    public void nombreAnimal(){// metodo crea mensaje nombre 
        System.out.println("hola soy una animal");
       
            
        }
    
         
         
        
    
    
        
        
    

    public double getEdad() {
        return edad;
    }

    public void setEdad(double edad) {
        this.edad = edad;
    }
     public static void main(String[] args) {
        Animales objeto=new Animales();//set para añadir un nombre  // esto es un objeto
        objeto.setNombre("perro");
        objeto.setEdad(10);
        objeto.setAltutra(15);
        objeto.setPeso(23);
        objeto.setColor("negro");
        System.out.println(objeto.infoAnimal());// imprimo metodo infoAnimal
         
          Animales objeto1=new Animales("gato",5.5,8.5,"negro",6.5);
          System.out.println(objeto.infoAnimal());
          
         
            
    
}
      public String infoAnimal(){// metodo de tipo String devuelve nombre mas color
         String informacion=nombre+" "+color+" "+edad+" "+altutra+" "+peso+" "+color;
         return informacion;
        
     
}
}

