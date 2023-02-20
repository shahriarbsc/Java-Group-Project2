abstract public class Car {
    int carPrice;
    String color;

    abstract double calculateSalePrice();
    Car(int carPrice,String color){
        this.carPrice=carPrice;
        this.color=color;
    }

}
class Truck extends Car{
    double weight;

    Truck(int carPrice, String color, double weight) {
        super(carPrice, color);
        this.weight=weight;
    }

    @Override
    double calculateSalePrice() {
        if (weight>2000){
            return carPrice*0.9;
        }else{
            return carPrice*0.8;
        }
    }
}
class Sedan extends Car {
    double length;

    Sedan(int carPrice, String color, double length) {
        super(carPrice, color);
        this.length=length;
    }

    @Override
    double calculateSalePrice() {
        if (length>20){
            return carPrice*0.95;
        }else{

            return carPrice*0.9;
        }

    }
}

class CarTest{
    public static void main(String[] args) {
        Car [] sales={new Sedan(60000,"White",3000),new Truck(65000,"Black",22)};
        for (Car price:sales){
            System.out.println(+price.calculateSalePrice()+"$ for "+price.color+" color included all discounts");
            System.out.println("Tax will be added at end of the sale");


        }
    }
}


