/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

/**
 *
 * @author drmorales4
 */
public class Principal {
    public static void main(String[] args) {
        // variables
        int[] valores = {10, 20, 30, 1, 2, 3, 40, 4};
        int tamanio2 = valores.length;
        int suma = 0;
        int tamanio;
         
        // for para sumar los elementos del arreglo
        for (int i = 0; i < valores.length; i++) {
            suma = suma + valores[i]; // sumar los valores del arreglo
        }
        
        // obtener la suma con el metodo
        tamanio = TamanioArreglo.obtenerTamanioArreglo(valores, tamanio2);
        
        // imprimir en pantalla la suma mediante el for y mediante el metodo de recursividad
        System.out.printf("La suma de elementos del arreglo (por el for) es: "
                + "%d \nLa suma de elementos del arreglo (por el metodo) "
                + "es: %d\n", suma, tamanio);
    }
    
}
