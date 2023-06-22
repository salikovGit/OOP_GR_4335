import java.io.IOException;

// Создать логирование операций, для класса Calculator. Класс Calculator не должен изменится.
public class Main {
    public static void main(String[] args) throws IOException {
        //iCalculable calculator = new Calculator(0);
        int[] start = new int[2];
        iCalculable calculator = new CalcDecorator(new ComplexCalc(start),new Logger());
        ViewCalculator view = new ViewCalculator(calculator);
        view.run();
    }
}
