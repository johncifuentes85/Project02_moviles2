package com.moviles2;

public class Main {

    public static void main(String[] args)
    {
     // si no tiene constructor el () va vacio pero si lo tiene hay que darle los valores requeridos
     Monitor device1 = new Monitor("LG", 21);
        //puede modificarse de dos manera el atributo
        //device1.size = 27; // se modifica a cualquier valor solo si esta publico
        System.out.println(device1.getSize()); // llama el primer valor antes de la modificacion
        device1.setSize(27); // tiene restrincion modifica si esta privado
        System.out.println(device1.getSize()); // muestra en pantalla (imprime en pantalla) el valor que retorna
    }
}
