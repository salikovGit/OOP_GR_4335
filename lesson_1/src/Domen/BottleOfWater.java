package Domen;

public class BottleOfWater extends Product{
    private int volume;

    /**
     * Java Class 'BottleOfWater' constructor (extends Product)
     * @param name Water name
     * @param price Price of one bottle
     * @param volume Volume of bottle
     */
    public BottleOfWater(String name, Double price, int volume) {
        super(name, price);
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "\n Product " +
                "name='" + getName() + '\'' +
                ", price=" + getPrice() +
                ", " +
                "Volume=" + volume;
    }
}
