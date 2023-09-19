package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao{

    private final List<Car> carList = new ArrayList<>(Arrays.asList(
            new Car(2011, "Toyota", "Camry"),
            new Car(2023, "Honda", "Civic"),
            new Car(2014, "Ford", "Mustang"),
            new Car(2015, "Chevrolet", "Impala"),
            new Car(2019, "Nissan", "Altima")
    ));

    @Override
    public List<Car> getAllCars() {
        return carList;
    }
}
