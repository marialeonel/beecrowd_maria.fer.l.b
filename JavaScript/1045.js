function triangleTypeIs(A, B, C) {
    const sides = [A, B, C].sort((a, b) => a - b);

    if (sides[2] >= sides[0] + sides[1]) {
        console.log("NAO FORMA TRIANGULO");
    } else if (sides[2]**2 === sides[0]**2 + sides[1]**2) {
        console.log("TRIANGULO RETANGULO");
    } else if (sides[2]**2 > sides[0]**2 + sides[1]**2) {
        console.log("TRIANGULO OBTUSANGULO");
    } else {
        console.log("TRIANGULO ACUTANGULO");
    }
}

function triangleSizeIs(A, B, C) {
    if (A === B && B === C) {
        console.log("TRIANGULO EQUILATERO");
    } else if (A === B || A === C || B === C) {
        console.log("TRIANGULO ISOSCELES");
    }
}

const input = require('readline-sync');
const values = input.question(" ").split(" ").map(Number);

const [A, B, C] = values;
triangleTypeIs(A, B, C);
triangleSizeIs(A, B, C);
