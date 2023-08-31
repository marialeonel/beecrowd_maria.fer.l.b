    let number = prompt('Digita ai kkk: ');
    let float_number = parseFloat(number);
    const exp_number = float_number.toExponential(4);
    const [mantissa, exponent] = exp_number.split('E');

    let final_number;
    if (float_number > 0) {
        final_number = '+' + mantissa + 'E' + exponent;
    } else {
        const negative_exponent = exponent.replace('+', '-');
        final_number = mantissa + 'E' + negative_exponent;
    }

    console.log(final_number);
    rl.close();
