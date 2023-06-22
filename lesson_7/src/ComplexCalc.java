public class ComplexCalc implements iCalculable{
    private final int[] primaryArgs;

    public ComplexCalc(int[] primaryArgs) {
        this.primaryArgs = primaryArgs;
    }

    @Override
    public iCalculable init(int[] args) {
        primaryArgs[0] = primaryArgs[0] + args[0];
        primaryArgs[1] = primaryArgs[1] + args[1];
        return this;
    }

    @Override
    public iCalculable sum(int[] args) {
        primaryArgs[0] = primaryArgs[0] + args[0];
        primaryArgs[1] = primaryArgs[1] + args[1];
        return this;
    }

    @Override
    public iCalculable multi(int[] args) {
        int[] initArgs = {primaryArgs[0], primaryArgs[1]};
        primaryArgs[0] = initArgs[0] * args[0] - initArgs[1] * args[1];
        primaryArgs[1] = initArgs[1] * args[0] + initArgs[0] * args[1];
        return this;
    }

    @Override
    public iCalculable dev(int[] args) {
        int[] initArgs = {primaryArgs[0], primaryArgs[1]};
        primaryArgs[0] = (initArgs[0] * args[0] + initArgs[1] * args[1])/(args[0] * args[0] + args[1] * args[1]);
        primaryArgs[1] = (initArgs[1] * args[0] - initArgs[0] * args[1])/(args[0] * args[0] + args[1] * args[1]);
        return this;
    }

    @Override
    public int[] getResult() {
        return primaryArgs;
    }
}
