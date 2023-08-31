import java.util.Scanner;

public class Main1958 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double float_number = 0.0;
        String exp_number, mantissa, exponent, final_number, negative_exponent = "";

        //Entrada
        float_number = scanner.nextDouble();

        //Processamento
        exp_number = String.format("%.4E", float_number);
        String parts[] = exp_number.split("E");
        mantissa = parts[0];
        exponent = parts[1];
        
        //Saída
        if (float_number > 0) {
            final_number = "+" + mantissa + "E" + exponent;
        } else {
            negative_exponent = exponent.replace("+", "-");
            final_number = "-" + mantissa + "E" + negative_exponent;
        }
        
        System.out.println(final_number);
        scanner.close();

    }
}
