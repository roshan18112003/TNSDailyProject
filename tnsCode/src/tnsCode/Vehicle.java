package tnsCode;

// Vehicle class
class Vehicle {
    private String brand;
    private int modelYear;

    public Vehicle(String brand, int modelYear) {
        this.brand = brand;
        this.modelYear = modelYear;
    }

    public String getBrand() {
        return brand;
    }

    public int getModelYear() {
        return modelYear;
    }

    public String toString() {
        return "Brand: " + brand + ", Model Year: " + modelYear;
    }
}

// Car class
class Car extends Vehicle {
    private String fuelType;
    private int speed;

    public Car(String brand, int modelYear, String fuelType, int speed) {
        super(brand, modelYear);
        this.fuelType = fuelType;
        this.speed= speed;
    }

    public String getFuelType() {
        return fuelType;
    }
    public int getspeed() {
    	return speed;
    }

    public String toString() {
        return super.toString() + ", Fuel Type: " + fuelType+ " Speed top "+speed;
    }
}

// Main class
class VehicleTest {
    public static void main(String[] args) {
        Car mycar = new Car("Mahindra", 2025, "Petrol", 200);
        System.out.println(mycar);
    }
}
