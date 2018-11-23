package com.company;

public class Human {
    private Head head;
    private Hand hand;
    private Leg leg;
    private String name;

    public Human(){
        name = "Вася";
        head = new Head();
        hand = new Hand();
        leg = new Leg();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLeg(Leg leg) {
        this.leg = leg;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public Hand getHand() {
        return hand;
    }

    public Head getHead() {
        return head;
    }

    public Leg getLeg() {
        return leg;
    }

    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return "Имя: " + name + '\n' + head.toString() + hand.toString() + leg.toString();
    }
}
