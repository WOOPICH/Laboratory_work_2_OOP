package com.company;
import java.util.*;

public class HumanTester {
    private static Human human;

    public static void testConstructor() {
        human = new Human();
        System.out.println("Человек, созданный с помощью конструктора" + '\n' + human.toString());
    }

    public static void testSetMethods() {
        Head head = new Head();
        head.setIsThereAHead(true);
        head.setNumOfEyes(1);
        head.setNose("Big one, OMG!!!");
        head.setMouth("Without Lips o_O");
        Hand hand = new Hand();
        hand.setLength(12.4);
        hand.setNumOfFingers(15);
        Leg leg = new Leg();
        leg.setLength(10.56123);
        leg.setNumOfFingers(2);
        human = new Human();
        human.setName("Виталька Резвый");
        human.setHead(head);
        human.setHand(hand);
        human.setLeg(leg);
        System.out.println("Человек, созданный методами Set" + '\n' + human.toString());
    }

    public static void testScanner() {
        Scanner sc = new Scanner(System.in);
        Head head = new Head();
        System.out.println("Есть ли голова у человека?");
        head.setIsThereAHead(sc.nextBoolean());
        if (head.getIsThereAHead()) {
            System.out.println("Сколько у него глаз?");
            head.setNumOfEyes(sc.nextInt());
            System.out.println("Какой нос?");
            sc.nextLine();
            head.setNose(sc.nextLine());
            System.out.println("Какой рот?");
            head.setMouth(sc.nextLine());
        } else {
            head.setNumOfEyes(0);
            head.setNose("NULL");
            head.setMouth("NULL");
        }
        Hand hand = new Hand();
        System.out.println("Какая у него длина рук?");
        hand.setLength(sc.nextDouble());
        System.out.println("Сколько пальцев на руках?");
        hand.setNumOfFingers(sc.nextInt());
        Leg leg = new Leg();
        System.out.println("Какая длина ног?");
        leg.setLength(sc.nextDouble());
        System.out.println("А сколько пальцев на ногах?");
        leg.setNumOfFingers(sc.nextInt());
        human = new Human();
        System.out.println("А зовут-то его как?");
        sc.nextLine();
        human.setName(sc.nextLine());
        human.setHead(head);
        human.setHand(hand);
        human.setLeg(leg);
        System.out.println();
        System.out.println("Человек, созданный пользователем" + '\n' + human.toString());
    }
}
