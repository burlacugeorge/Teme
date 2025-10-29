package org.example.TemaDin11Octombrie;


public class ShapeDrawer {


    public static void drawShapeOutline(int width, int height) {
        if (width < 2 || height < 2) {
            System.out.println("Dimensiunile trebuie să fie cel puțin 2x2.");
            return;
        }


        for (int i = 0; i < width; i++) {
            System.out.print("*");
        }
        System.out.println();


        for (int i = 0; i < height - 2; i++) {
            System.out.print("*");
            for (int j = 0; j < width - 2; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }

        for (int i = 0; i < width; i++) {
            System.out.print("*");
        }
        System.out.println();
    }


    public static void drawFilledShape(int width, int height) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("Conturul formei:");
        drawShapeOutline(10, 4);

        System.out.println("\nForma plină:");
        drawFilledShape(10, 4);
    }
}
