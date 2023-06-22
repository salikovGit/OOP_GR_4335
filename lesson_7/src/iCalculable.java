

public interface iCalculable {
    /**
     * Calculation method
     * @param arg Some complex number
     * @return Result of sum
     */
    iCalculable sum(int[] arg);

    /**
     * Calculation method
     * @param arg Some complex number
     * @return Result of multiplication
     */
    iCalculable multi(int[] arg);

    /**
     * Calculation method
     * @param arg Some complex number
     * @return Result of division
     */
    iCalculable div(int[] arg);

    /**
     * Calculation method
     * @return Result of calculation
     */
    int[] getResult();

    /**
     * Calculation method
     * @return Initial calculation number
     */
    iCalculable init(int[] args);

}
