

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ViewCalculator {

    private final iCalculable calculator;

    public ViewCalculator(iCalculable calculator) {
        this.calculator = calculator;
    }

    public void run() throws IOException {
        while (true) {
            int[] primaryArg = promptInt("Введите первое число через пробел: ");
            calculator.init(primaryArg);
            //iCalculable calculator = calculableFactory.create(primaryArg);
            while (true) {
                String cmd = prompt("Введите команду (*, +, /, =) : ");
                if (cmd.equals("*")) {
                    int[] args = promptInt("Введите второе число через пробел: ");
                    calculator.multi(args);
                    continue;
                }
                if (cmd.equals("+")) {
                    int[] args = promptInt("Введите второе число через пробел: ");
                    calculator.sum(args);
                    continue;
                }
                if (cmd.equals("/")) {
                    int[] args = promptInt("Введите второе число через пробел: ");
                    calculator.dev(args);
                    continue;
                }
                if (cmd.equals("=")) {
                    int[] result = calculator.getResult();
                    System.out.printf("Результат %d %di\n", result[0], result[1]);
                    break;
                }
            }
            String cmd = prompt("Еще посчитать (Y/N)?");
            if (cmd.equals("Y")) {
                continue;
            }
            break;
        }
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    private int[] promptInt(String message) throws IOException {
        System.out.println(message);
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
        int[] num = new int[2];
        String[] strNums;
        strNums = bi.readLine().split(" ");
        for (int i = 0; i < strNums.length; i++) {
            num[i] = Integer.parseInt(strNums[i]);
        }
        return num;
    }
}
