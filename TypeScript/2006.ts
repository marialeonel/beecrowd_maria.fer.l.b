const input = require('fs').readFileSync('/dev/stdin', 'utf8').split("\n");

const type = parseInt(input[0]);
const constentants_responses = input[1].split(" ").map(Number);
const count = constentants_responses.filter(c => c == type).length;
console.log(count);