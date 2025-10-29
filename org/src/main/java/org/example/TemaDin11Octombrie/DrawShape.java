package org.example.TemaDin11Octombrie;

public class DrawShape {


    public static void drawShapeOutline(int width, int height) {
        if (width < 2 || height < 2) {
            System.out.println("Dimensiunile trebuie să fie cel puțin 2x2.");
            return;
        }


        for (int i = 0; i < width; i++) System.out.print("*");
        System.out.println();


        for (int i = 0; i < height - 2; i++) {
            System.out.print("*");
            for (int j = 0; j < width - 2; j++) System.out.print(" ");
            System.out.println("*");
        }


        for (int i = 0; i < width; i++) System.out.print("*");
        System.out.println();
    }


    public static void drawShapeOutline(int size) {
        drawShapeOutline(size, size);
    }


    public static void drawShapeCorners(int width, int height) {
        if (width < 2 || height < 2) {
            System.out.println("Dimensiunile trebuie să fie cel puțin 2x2.");
            return;
        }

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if ((i == 0 && j == 0) ||
                        (i == 0 && j == width - 1) ||
                        (i == height - 1 && j == 0) ||
                        (i == height - 1 && j == width - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }


    public static void drawShapeCorners(int size) {
        drawShapeCorners(size, size);
    }


    public static void main(String[] args) {
        System.out.println("Contur dreptunghi 10x4:");
        drawShapeOutline(10, 4);

        System.out.println("\nContur pătrat 5x5:");
        drawShapeOutline(5);

        System.out.println("\nColțuri dreptunghi 6x3:");
        drawShapeCorners(6, 3);

        System.out.println("\nColțuri pătrat 4x4:");
        drawShapeCorners(4);
    }
}


