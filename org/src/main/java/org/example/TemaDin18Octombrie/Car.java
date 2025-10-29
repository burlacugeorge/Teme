package org.example.TemaDin18Octombrie;

public class Car {
    private boolean isRunning;
    private int speed;
    private String direction;


    public Car() {
        this.isRunning = false;
        this.speed = 0;
        this.direction = "forward";
    }


    public void start() {
        if (!isRunning) {
            isRunning = true;
            speed = 0;
            System.out.println("Mașina a fost pornită.");
        } else {
            System.out.println("Mașina este deja pornită.");
        }
    }


    public void stop() {
        if (isRunning) {
            isRunning = false;
            speed = 0;
            System.out.println("Mașina a fost oprită.");
        } else {
            System.out.println("Mașina este deja oprită.");
        }
    }


    public void accelerate() {
        if (isRunning) {
            speed += 10;
            System.out.println("Mașina accelerează. Viteza curentă: " + speed + " km/h");
        } else {
            System.out.println("Nu poți accelera. Mașina este oprită.");
        }
    }


    public void turnRight() {
        if (isRunning) {
            direction = "dreapta";
            System.out.println("Mașina virează la dreapta.");
        } else {
            System.out.println("Nu poți vira. Mașina este oprită.");
        }
    }


    public void turnLeft() {
        if (isRunning) {
            direction = "stânga";
            System.out.println("Mașina virează la stânga.");
        } else {
            System.out.println("Nu poți vira. Mașina este oprită.");
        }
    }


    public void displayStatus() {
        if (isRunning) {
            System.out.println("Mașina este pornită. Viteza: " + speed + " km/h. Direcția: " + direction + ".");
        } else {
            System.out.println("Mașina este oprită.");
        }
    }
}

class CarFunctions {
    public static void main(String[] args) {
        Car myCar = new Car();

        myCar.displayStatus();
        myCar.start();
        myCar.accelerate();
        myCar.turnRight();
        myCar.accelerate();
        myCar.turnLeft();
        myCar.stop();
        myCar.displayStatus();
    }
}

