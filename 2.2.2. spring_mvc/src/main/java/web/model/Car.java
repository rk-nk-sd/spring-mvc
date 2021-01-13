package web.model;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private String carModel;
    private String color;
    private int year;

    public Car(String carModel, String color, int year) {
        this.carModel = carModel;
        this.color = color;
        this.year = year;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;

    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carModel='" + carModel + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                '}';
    }
}
