package ua.en.kosse;

public class Taxi {
    private Integer number; // номер авто
    private String name;  // найменування (марка)
    private Boolean busy; //таксі вільне
    private char class_auto;
    private int iClass_auto;

    public Taxi(int iClass_auto, Integer number, String name, Boolean busy) {
        char[] aClass_auto = {'A','B','C','D'};
        this.iClass_auto = iClass_auto;
        this.class_auto = aClass_auto[iClass_auto];
        this.number = number;
        this.name = name;
        this.busy = busy;
    }

    public char getClass_auto() {
        return class_auto;
    }

    public Integer getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public Boolean getBusy() {
        return busy;
    }

    public void setBusy(Boolean busy) {
        this.busy = busy;
    }

    public double get_class_koef () {
        return this.iClass_auto+1;
    }
}
