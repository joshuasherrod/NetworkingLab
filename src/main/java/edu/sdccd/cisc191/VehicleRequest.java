package cisc191.sdccd.edu;

import java.io.Serializable;

public class VehicleRequest implements Serializable{

    private int year;
    private String make;
    private String model;
    String vehicle;

    public void Vehicle(int year, String make, String model) {
        this.year = year;
        this.make = make;
        this.model = model;

        vehicle = "Vehicle: " + year + " " + make + " " + model + ".";
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }


}
