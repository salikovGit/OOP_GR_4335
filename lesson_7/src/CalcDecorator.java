public class CalcDecorator implements iCalculable {
    private iCalculable oldCalc;
    private Logger logger;
    public CalcDecorator(iCalculable oldCalc, Logger log) {
        this.oldCalc = oldCalc;
        this.logger = log;
    }

     @Override
    public iCalculable sum(int[] args) {
        int[] primaryArgs = oldCalc.getResult();
        logger.log(String.format("Первое значение калькулятора %d %di. Начало вызова метода сумма с параметром %d %di",
                primaryArgs[0], primaryArgs[1], args[0], args[1]));
        iCalculable result = oldCalc.sum(args);
        logger.log("Вызова метода sum произошел");
        return result;
    }

    @Override
    public iCalculable multi(int[] args) {
        int[] primaryArgs = oldCalc.getResult();
        logger.log(String.format("Первое значение калькулятора %d %di. Начало вызова метода умножение с параметром %d %di",
                primaryArgs[0], primaryArgs[1], args[0], args[1]));
        iCalculable result = oldCalc.multi(args);
        logger.log("Вызова метода multi произошел");
        return result;
    }

    @Override
    public iCalculable dev(int[] args) {
        int[] primaryArgs = oldCalc.getResult();
        logger.log(String.format("Первое значение калькулятора %d %di. Начало вызова метода деление с параметром %d %di",
                primaryArgs[0], primaryArgs[1], args[0], args[1]));
        iCalculable result = oldCalc.dev(args);
        logger.log("Вызова метода multi произошел");
        return result;
    }

    @Override
    public int[] getResult() {
        int[] result = oldCalc.getResult();
        logger.log(String.format("Получение результата %d %di", result[0], result[1]));
        return result;
    }

    @Override
    public iCalculable init(int[] args) {
        iCalculable result = oldCalc.init(args);
        logger.log(String.format("Получено первое число %d %di", result.getResult()[0], result.getResult()[1]));
        return result;    }

}
