package web.services;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
@Service
public class CarServiseImpl implements CarService {

    private List<Car> listCar;


    {
        listCar = new ArrayList<>();

        listCar.add(new Car(1L,"Mercedes","224"));
        listCar.add(new Car(2L,"BMW","M5"));
        listCar.add(new Car(3L,"Lexus","LX670"));
        listCar.add(new Car(4L,"Toyota","Camry"));
        listCar.add(new Car(5L,"Ferrari","Enzo"));
    }




    @Override
    public List<Car> getCarcount(int count) {

      var res = listCar.stream().limit(count).collect(Collectors.toList());

        return res;
    }
}
