package com.company;
import java.lang.String;

public class Head  {
    private boolean isThereAHead;
    private String nose;
    private String mouth;
    private int numOfEyes;

    public Head() {
        isThereAHead = true;
        nose = "Small";
        mouth = "Small";
        numOfEyes = 2;
    }

    public void setMouth(String mouth) {
        this.mouth = mouth;
    }

    public void setIsThereAHead(boolean thereAHead) {
        isThereAHead = thereAHead;
    }

    public void setNose(String nose) {
        this.nose = nose;
    }

    public void setNumOfEyes(int numOfEyes) {
        this.numOfEyes = numOfEyes;
    }

    public boolean getIsThereAHead() {
        return isThereAHead;
    }

    public String getMouth() {
        return mouth;
    }

    public String getNose() {
        return nose;
    }

    public int getNumOfEyes() {
        return numOfEyes;
    }

    @Override
    public String toString() {
        return "Голова: " + isThereAHead + "\n" +
                "Нос: " + nose + "\n" +
                "Рот: " + mouth + "\n" +
                "Глаза: " + numOfEyes + "\n";
    }
}
