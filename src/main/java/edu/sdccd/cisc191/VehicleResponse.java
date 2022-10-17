package cisc191.sdccd.edu;

import java.io.Serializable;

public class VehicleResponse implements Serializable {
    private VehicleRequest request;
    private int milesOnVehicle;
    private int price;
    private int numberOfSeats;
    private int numberOfDoors;
    private String[] options;
    public String vehicle;

    public VehicleResponse(VehicleRequest request, int milesOnVehicle, int price, int numberOfSeats, int numberOfDoors, String[] options) {
        this.request = request;
        this.milesOnVehicle = milesOnVehicle;
        this.price = price;
        this.numberOfSeats = numberOfSeats;
        this.numberOfDoors = numberOfDoors;
        this.options = options;
        vehicle = request.vehicle;
    }

    public VehicleRequest getRequest() {
        return request;
    }

    public void setRequest(VehicleRequest request) {
        this.request = request;
    }

    public int getMilesOnVehicle() {
        return milesOnVehicle;
    }

    public void setMilesOnVehicle(int milesOnVehicle) {
        this.milesOnVehicle = milesOnVehicle;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public String[] getOptions() {
        return options;
    }

    public void setOptions(String[] options) {
        this.options = options;
    }
}

