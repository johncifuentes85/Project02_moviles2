package com.moviles2;

public class Monitor {
    private String color;
    private String brand;
    private String serial;
    private int size;

    //pasa parametros obligatorios
    public Monitor(String brand, int size) {
        this.brand = brand;
        this.size = size;
    }

    // se crea el get y el set de las variables
    void setSize (int size) // modifica no retorna nada
    {
        this.size = size;
    }

    int getSize() //retorna informacion
    {
        return size;
    }
    // se pueden generar automaticamente clik derecho generate getter and setter o alt+intro
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }
}
