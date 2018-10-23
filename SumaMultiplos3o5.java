
package sumamultiplos3o5;

/**
 * Si enlistamos todos los numeros naturales debajo de 10
 * que son multiplos de 3 o 5, obtenemos 3,5,6 y 9. 
 * La suma de estos multiplos es 23.
 * Encuentra la suma de todos los multiplos de 3 o 5 debajo de 1000
 */
public class SumaMultiplos3o5 {

    public static void main(String[] args) {
        EncontrarSumaMultiplos();
    }
    
    public static void EncontrarSumaMultiplos(){
        
        //Creamos una variable sumatoria para almacenar
        //las sumas de los multiplos de 3 o 5
        int sumatoria=0;
        
        //Iteramos a traves de los numeros del 1 al 1000
        for(int i = 1; i < 1000; i++){
            //Un numero x es multiplo de y si y solo si
            //el residuo despues de dividir x entre y es 0
            //Usamos el operador modulo para hacer esa operacion
            
            //Encontrando los multiplos de 3 o 5 y sumandolos
            if( i%3 == 0 || i%5 == 0 ) {
                sumatoria = sumatoria + i;
            }
        }
        //Mostramos la suma de los multiplos de 3 o 5 debajo de 1000
        System.out.println("La suma de suma de los multiplos de 3 o 5 debajo de 1000 es: "+sumatoria);
    }
}
