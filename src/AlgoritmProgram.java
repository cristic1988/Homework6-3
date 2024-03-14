import java.util.Random;

public class AlgoritmProgram {


    public static void main(String[] args) {
        Random random = new Random();

        int intNum = random.nextInt(100_011) + 11;
        System.out.print("Сумма числа " + intNum + ": ");


        int sum = 0;
        while (intNum > 0) {
            sum += intNum % 10;
            intNum /= 10;

        }
        System.out.print(sum);

    }
}




