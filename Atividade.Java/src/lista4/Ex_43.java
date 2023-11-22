import java.math.BigInteger;

public class Ex_43 {

    public static void main(String[] args) {
        BigInteger totalGraos = BigInteger.ONE;
        for (int i = 1; i <= 64; i++) {
            totalGraos = totalGraos.multiply(BigInteger.TWO);
        }
        System.out.println("O monge esperava receber " + totalGraos + " grãos de trigo.");
    }
}
