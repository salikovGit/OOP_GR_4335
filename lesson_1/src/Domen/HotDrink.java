package Domen;

public class HotDrink extends Product{
    private int temperature;
    private int volume;

    /**
     * Java Class 'HotDrink' constructor (extends Product)
     * @param name Drink name
     * @param price Drink price
     * @param temperature Drink temperature
     * @param volume Cup volume
     */
    public HotDrink(String name, Double price, int temperature, int volume) {
        super(name, price);
        this.temperature = temperature;
        this.volume = volume;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "\n Product " +
                "name='" + getName()+ '\'' +
                ", price=" + getPrice() +
                ", volume= " + volume +
                ", temperature=" + temperature;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
