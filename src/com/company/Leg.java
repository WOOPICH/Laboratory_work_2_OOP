package com.company;

public class Leg {
    private int numOfFingers;
    private double length;

    public Leg()
    {
        numOfFingers = 10;
        length = 100.4;
    }

    public void setNumOfFingers(int numOfFingers) {
        this.numOfFingers = numOfFingers;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public int getNumOfFingers() {
        return numOfFingers;
    }

    @Override
    public String toString() {
        return "Количество пальцев на ногах: " + numOfFingers + "\n" +
                "Длина ноги: " + length + "\n";
    }
}
