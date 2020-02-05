import java.util.ArrayList;

public class Customer {
    private String name;
    private int money;
    private ArrayList<Car> ownedCars;

    public Customer(String name, int money) {
        this.name = name;
        this.money = money;
        this.ownedCars = new ArrayList<Car>();
    }

    public String getName() {
        return name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public ArrayList<Car> getOwnedCars() {
        return ownedCars;
    }

    public void payMoney(Car car){
        this.money -= car.getPrice();
    }

    public void buyCar(Car car, Dealership dealer){
        this.payMoney(car);
        dealer.addMoney(car);
        Car purchasedCar = dealer.removeCar(car);
        this.ownedCars.add(purchasedCar);

    }
}
