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
public class Pensador {
    private int valorEntero;
    
    public Pensador (){}
    
    public Pensador (int valorEntero){
        this.valorEntero=valorEntero;
    }

    public int getValorEntero() {
        return valorEntero;
    }

    public void setValorEntero(int valorEntero) {
        this.valorEntero = valorEntero;
    }
    
    
    
    public int invertir (){
      int cifra;
      int nuevoNumero=0;
      int x=valorEntero;
        
       while (x % 10 > 0){
        cifra = x % 10;
        x = x / 10;
        nuevoNumero = nuevoNumero * 10 + cifra;
        }
        return nuevoNumero;
    }
    
    public int parAntes (){
        if (valorEntero %2==0) {
            return valorEntero - 2;
        }else{
            return valorEntero - 1;
        }
    }
    
    public int parPosterior (){
        if (valorEntero%2==0) {
           return valorEntero + 2;
        }else{
         return valorEntero + 1;
       }
   }
    
    public int primerDigito (){
       return this.invertir()%10;
    }
    
    public int ultimoDigito (){
        return valorEntero % 10;
    }
}
