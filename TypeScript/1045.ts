const input = require('fs').readFileSync('/dev/stdin', 'utf8');
const [A, B, C] = input.trim().split(/\s+/).map(Number);

let sides = [A, B, C].sort((a, b) => b - a);
const [a, b, c] = sides;

if (a >= b + c) {
    console.log("NAO FORMA TRIANGULO");
} else {
    const a2 = a * a;
    const b2c2 = b * b + c * c;

    if (a2 === b2c2) {
        console.log("TRIANGULO RETANGULO");
    } else if (a2 > b2c2) {
        console.log("TRIANGULO OBTUSANGULO");
    } else {
        console.log("TRIANGULO ACUTANGULO");
    }

    if (a === b && b === c) {
        console.log("TRIANGULO EQUILATERO");
    } else if (a === b || a === c || b === c) {
        console.log("TRIANGULO ISOSCELES");
    }
}
