package com.company;

public class Hand {
    private int numOfFingers;
    private double length;

    public Hand()
    {
        numOfFingers = 10;
        length = 40.4;
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
        return "Количество пальцев на руках: " + numOfFingers + "\n" +
                "Длина руки: " + length + "\n";
    }
}
