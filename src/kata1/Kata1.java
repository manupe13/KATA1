package kata1;

import java.util.Date;

public class Kata1 {
    //Método main , donde me creo un objeto de la clase Persona e imprimo el nombre y la edad.
    public static void main(String[] args) {
        Persona emmanuel = new Persona("Emmanuel Peña Mendoza", new Date(99, 2, 13));
        System.out.println(emmanuel.getName()+ " tiene " +emmanuel.getAge() + " años");
    }
}

