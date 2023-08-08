/*
Read 3 double numbers (A, B and C) representing the sides of a triangle and arrange them in decreasing order, so that the side A is the biggest of the three sides. Next, determine the type of triangle that they can make, based on the following cases always writing an appropriate message:
if A ≥ B + C, write the message: NAO FORMA TRIANGULO
if A2 = B2 + C2, write the message: TRIANGULO RETANGULO
if A2 > B2 + C2, write the message: TRIANGULO OBTUSANGULO
if A2 < B2 + C2, write the message: TRIANGULO ACUTANGULO
if the three sides are the same size, write the message: TRIANGULO EQUILATERO
if only two sides are the same and the third one is different, write the message: TRIANGULO ISOSCELES
Input
The input contains three double numbers, A (0 < A) , B (0 < B) and C (0 < C).

Output
Print all the classifications of the triangle presented in the input.
*/

import java.util.Arrays;
import java.util.Scanner;

public class Main1045 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double A, B, C;

        A = scanner.nextDouble();
        B = scanner.nextDouble();
        C = scanner.nextDouble();

        triangleTypeIs(A, B, C);
        triangleSizeIs(A, B, C);
    }

    public static void triangleTypeIs(double A, double B, double C) {
        double[] sides = {A, B, C};
        Arrays.sort(sides);

        if (sides[2] >= sides[0] + sides[1]) {
            System.out.println("NAO FORMA TRIANGULO");
            return;
        }

        if (sides[2] * sides[2] == sides[0] * sides[0] + sides[1] * sides[1]) {
            System.out.println("TRIANGULO RETANGULO");
        } else if (sides[2] * sides[2] > sides[0] * sides[0] + sides[1] * sides[1]) {
            System.out.println("TRIANGULO OBTUSANGULO");
        } else {
            System.out.println("TRIANGULO ACUTANGULO");
        }
    }

    public static void triangleSizeIs(double A, double B, double C) {
        if (A == B && A == C) {
            System.out.println("TRIANGULO EQUILATERO");
        } else if (A == B || A == C || B == C) {
            System.out.println("TRIANGULO ISOSCELES");
        }
    }
}
