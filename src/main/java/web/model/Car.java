package web.model;


public class Car {
    private String carModel;
    private int series;
    private int yearOfProduction;

    public Car(String carModel, int series, int yearOfProduction) {
        this.carModel = carModel;
        this.series = series;
        this.yearOfProduction = yearOfProduction;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }
}
