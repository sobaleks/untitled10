package org.example;

public class Telephone {
    private int id_telephone;
    private String model;
    private String color;

    public int getId_telephone() {
        return id_telephone;
    }

    public void setId_telephone(int id_telephone) {
        this.id_telephone = id_telephone;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return ("ID телефона-"+id_telephone+", модель-"+model+", цвет-"+color);
    }
}
