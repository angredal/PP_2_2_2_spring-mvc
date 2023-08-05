package web.service;

import web.model.Car;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {
    private List<Car> cars;

    public CarService() {
        cars = new ArrayList<>();
        cars.add(new Car("BMW", 3, 1835));
        cars.add(new Car("AUDI", 2, 2005));
        cars.add(new Car("UAZ", 9, 2005));
        cars.add(new Car("Lada", 95, 2014));
        cars.add(new Car("Volvo", 10, 2007));
    }

    public List<Car> getCars(int count) {
        if (count > 0 && count < 5) {
            return cars.subList(0, count);
        }
        return cars;
    }
}
