public class Car {
    public String model;
    public String color;
    public int year;
    public float speed = 0;

    public void alterSpeed( float newSpeed) {
        this.speed = newSpeed;
    }

    public void accelerateCar() {
        System.out.println("Acelerando "+this.model);
    }

    public void brakeCar() {
        System.out.println("Freando "+this.model);
    }

    public void informationCar() {
        System.out.println("Modelo: "+this.model+"\ncor: "+this.color+"\nyear: "+this.year+"\nspeed: "+this.speed);
    }

    public void arrayCar(String[] cars) {
        for (String car : cars) {
            System.out.println(car);
        }
    }
}
