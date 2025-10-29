package org.example.TemaDin11Octombrie;

public class ShapeCorners {
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

    public static void main(String[] args) {
        System.out.println("\nDoar colțurile:");
        drawShapeCorners(10, 5);
    }
}

