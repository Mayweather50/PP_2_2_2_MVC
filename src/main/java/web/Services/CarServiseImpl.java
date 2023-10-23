package web.Services;

import org.springframework.stereotype.Component;
import web.Model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
@Component
public class CarServiseImpl implements CarService {

    private List<Car> listCar;
    private static long COUNT_CAR;

    {
        listCar = new ArrayList<>();

        listCar.add(new Car(++COUNT_CAR,"Mercedes","224"));
        listCar.add(new Car(++COUNT_CAR,"BMW","M5"));
        listCar.add(new Car(++COUNT_CAR,"Lexus","LX670"));
        listCar.add(new Car(++COUNT_CAR,"Toyota","Camry"));
        listCar.add(new Car(++COUNT_CAR,"Ferrari","Enzo"));
    }




    @Override
    public List<Car> getCarcount(int count) {

      var res = listCar.stream().limit(count).collect(Collectors.toList());

        return res;
    }
}
