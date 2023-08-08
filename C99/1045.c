/*
Read 3 double numbers (A, B and C) representing the sides of
a triangle and arrange them in decreasing order, so that the
side A is the biggest of the three sides. Next, determine the
type of triangle that they can make, based on the following
cases always writing an appropriate message:
if A ≥ B + C, write the message: NAO FORMA TRIANGULO
if A2 = B2 + C2, write the message: TRIANGULO RETANGULO
if A2 > B2 + C2, write the message: TRIANGULO OBTUSANGULO
if A2 < B2 + C2, write the message: TRIANGULO ACUTANGULO
if the three sides are the same size, write the message:
TRIANGULO EQUILATERO
if only two sides are the same and the third one is different,
write the message: TRIANGULO ISOSCELES
Input
The input contains three double numbers, A (0 < A) , B (0 < B)
and C (0 < C).

Output
Print all the classifications of the triangle presented in the input.

*/


#include <stdio.h>
#include <math.h>

void triangleTypeIs(double A, double B, double C) {
    double sides[3] = {A, B, C};
    for (int i = 0; i < 3; i++) {
        for (int j = i + 1; j < 3; j++) {
            if (sides[j] < sides[i]) {
                double temp = sides[i];
                sides[i] = sides[j];
                sides[j] = temp;
            }
        }
    }

    if (sides[2] >= sides[0] + sides[1]) {
        printf("NAO FORMA TRIANGULO\n");
        return;
    }

    if (sides[2] * sides[2] == sides[0] * sides[0] + sides[1] * sides[1]) {
        printf("TRIANGULO RETANGULO\n");
    } else if (sides[2] * sides[2] > sides[0] * sides[0] + sides[1] * sides[1]) {
        printf("TRIANGULO OBTUSANGULO\n");
    } else {
        printf("TRIANGULO ACUTANGULO\n");
    }
}

void triangleSizeIs(double A, double B, double C) {
    if (A == B && A == C) {
        printf("TRIANGULO EQUILATERO\n");
    } else if (A == B || A == C || B == C) {
        printf("TRIANGULO ISOSCELES\n");
    }
}

int main() {
    double A, B, C;
    scanf("%lf %lf %lf", &A, &B, &C);

    triangleTypeIs(A, B, C);
    triangleSizeIs(A, B, C);

    return 0;
}
