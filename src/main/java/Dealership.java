import java.util.ArrayList;

public class Dealership {

    private String name;
    private int till;
    private ArrayList<Car> stock;

    public Dealership(String name, int till) {
        this.name = name;
        this.till = till;
        this.stock = new ArrayList<Car>();
    }

    public String getName() {
        return name;
    }

    public int getTill() {
        return till;
    }

    public ArrayList<Car> getStock() {
        return stock;
    }

    public void addStock(Car car){
        this.stock.add(car);
    }

    public Car removeCar(Car car){
        int carIndex = this.stock.indexOf(car);
        return this.stock.remove(carIndex);
    }

    public void addMoney(Car car){
        this.till += car.getPrice();
    }

    public void repairCar(Car car){
        int damageRepaired = car.getDamage();
        car.setDamage(0);
        this.till -= damageRepaired;
    }
}
