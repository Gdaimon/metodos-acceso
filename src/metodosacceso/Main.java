package metodosacceso;

// Forma Uno
// import metodosacceso.casa.Gato;
// import metodosacceso.casa.Persona;
import metodosacceso.casa.*;

public class Main {

    public static void main(String[] args) {
        
        // metodosacceso.casa.Persona persona = new metodosacceso.casa.Persona("Martha", 25);
        Persona persona = new Persona("Martha", 25);
        Gato gato = new Gato();
        gato.raza="Angora";
        
        //persona.setEdad(10);
        //persona.setNombre("Pablo");
        System.out.println(persona.getNombre());
        
        Perro perro = new Perro();
        perro.nombre="Tobby";
        
    }
    
}
