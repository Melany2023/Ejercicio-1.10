/*
 En un nuevo proyecto, crear una clase de nombre Pensador con un atributo que almacenará
un valor entero; un constructor que permita inicializar dicho atributo; los métodos get y set para
dicho atributo y los siguientes métodos adicionales:

 invertir(): Este método retornará el valor guardado en el atributo con sus cifras
invertidas. Por ejemplo si el valor guardado es 3915, retornará 5193
 parAntes(): Este método retornará el valor par próximo anterior al valor guardado.

 parPosterior(): Este método retornará el valor par próximo posterior al valor
guardado.
 primerDigito(): Este método retornará el primer dígito del valor guardado.
 ultimoDigito(): Este método retornará el último dígito del valor guardado.
Luego desde la clase principal del proyecto (la que contiene el método main) se pide:
a) Crear una instancia de la clase Pensador.
b) Probar todos sus métodos y mostrar por consola los resultados obtenidos.
 */
package ejercicio.pkg1.pkg10;

/**
 *
 * @author Nicole
 */
public class Ejercicio110 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pensador instancia1=new Pensador (234);
        System.out.println("Numero invertido: "+instancia1.invertir());
       System.out.println("Numero par anterior: "+instancia1.parAntes());
       System.out.println("Numero par posterior: "+instancia1.parPosterior());
        System.out.println("El primer diigto es: "+instancia1.primerDigito());
        System.out.println("El ultimo digito es: "+instancia1.ultimoDigito());
        System.out.println("MODIFICANDO CristianMArch");
        System.out.println("Nuevo cambio Mel");
        System.out.println("soy Diego..!!!");
        System.out.println("Catullo");
<<<<<<< HEAD
        System.out.println("Prueba2");
=======
>>>>>>> main
        CAMBIO
                Nuevo cambio
    }
    
}
