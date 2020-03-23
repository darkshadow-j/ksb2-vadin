package pl.pawel.ksb2vadin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.pawel.ksb2vadin.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {

    private List<Car> carList;


    public CarService() {
        carList = new ArrayList<>();
        carList.add(new Car("X","model"));
        carList.add((new Car("Y","Z")));
    }

    public List<Car> getCarList() {
        return carList;
    }

    public void setCarList(List<Car> carList) {
        this.carList = carList;
    }

    public void AddCar(Car car){
        carList.add(car);
    }
}
