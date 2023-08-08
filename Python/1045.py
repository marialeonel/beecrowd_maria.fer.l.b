'''
Read 3 double numbers (A, B and C) representing the sides of a triangle and
arrange them in decreasing order, so that the side A is the biggest of the
three sides. Next, determine the type of triangle that they can make,
based on the following cases always writing an appropriate message:

if A ≥ B + C, write the message: NAO FORMA TRIANGULO
if A2 = B2 + C2, write the message: TRIANGULO RETANGULO
if A2 > B2 + C2, write the message: TRIANGULO OBTUSANGULO
if A2 < B2 + C2, write the message: TRIANGULO ACUTANGULO
if the three sides are the same size, write the message:
TRIANGULO EQUILATERO
if only two sides are the same and the third one is different,
write the message: TRIANGULO ISOSCELES

Input
The input contains three double numbers, A (0 < A) , B (0 < B) and C (0 < C).

Output
Print all the classifications of the triangle presented in the input.
'''


def triangle_type_is(A, B, C):
    sides = sorted([A, B, C])

    if sides[2] >= sides[0] + sides[1]:
        return print("NAO FORMA TRIANGULO")
    elif sides[2]**2 == sides[0]**2 + sides[1]**2:
        print("TRIANGULO RETANGULO")
    elif sides[2]**2 > sides[0]**2 + sides[1]**2:
        print("TRIANGULO OBTUSANGULO")
    else:
        print("TRIANGULO ACUTANGULO")


def triangle_size_is(A, B, C):

    if A == B == C:
        return print("TRIANGULO EQUILATERO")
    elif (A == B or A == C or B == C):
        return print("TRIANGULO ISOSCELES")


if __name__ == '__main__':
    A, B, C = map(float, input().split())
    triangle_type_is(A, B, C)
    triangle_size_is(A, B, C)
