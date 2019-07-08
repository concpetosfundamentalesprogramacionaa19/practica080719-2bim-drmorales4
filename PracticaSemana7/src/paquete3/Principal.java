/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

/**
 *
 * @author drmorales4
 */
public class Principal {
    public static void main(String[] args) {
        // variable
        int potencia;
        
        // calcular con el metodo
        potencia = Potencia.get_potencia(2, 4);
        // imprimir en pantalla
        System.out.printf("La potencia de 2 elevado a 4 es: %d\n", potencia);
    }
}
