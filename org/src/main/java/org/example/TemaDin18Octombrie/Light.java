package org.example.TemaDin18Octombrie;


public class Light {
    private boolean isOn;
    private int brightness; // nivel de luminozitate: 0 - 100


    public Light() {
        this.isOn = false;
        this.brightness = 0;
    }


    public void turnOn() {
        if (!isOn) {
            isOn = true;
            brightness = 50;
            System.out.println("Lumina a fost pornită. Luminozitate: " + brightness + "%");
        } else {
            System.out.println("Lumina este deja pornită.");
        }
    }


    public void turnOff() {
        if (isOn) {
            isOn = false;
            brightness = 0;
            System.out.println("Lumina a fost oprită.");
        } else {
            System.out.println("Lumina este deja oprită.");
        }
    }


    public void dim() {
        if (isOn) {
            if (brightness > 10) {
                brightness -= 10;
                System.out.println("Lumina a fost redusă la " + brightness + "%.");
            } else {
                brightness = 0;
                System.out.println("Lumina este la intensitate minimă.");
            }
        } else {
            System.out.println("Nu se poate reduce lumina. Este oprită.");
        }
    }


    public void brighten() {
        if (isOn) {
            if (brightness < 100) {
                brightness += 10;
                System.out.println("Lumina a fost mărită la " + brightness + "%.");
            } else {
                System.out.println("Lumina este deja la intensitate maximă.");
            }
        } else {
            System.out.println("Nu se poate mări lumina. Este oprită.");
        }
    }


    public void displayStatus() {
        if (isOn) {
            System.out.println("Lumina este pornită. Luminozitate: " + brightness + "%");
        } else {
            System.out.println("Lumina este oprită.");
        }
    }
}

class Main {
    public static void main(String[] args) {
        Light light = new Light();

        light.displayStatus();
        light.turnOn();
        light.brighten();
        light.dim();
        light.turnOff();
    }
}


