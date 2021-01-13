package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarServiceImp;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarsController {
    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(value = "count", required = false) Integer count, ModelMap model) {
        List<Car> cars = new ArrayList<>();

        cars.add(new Car("Volvo V40" , "black", 2005));
        cars.add(new Car("Citroen C1", "metal-blue", 2004));
        cars.add(new Car("Dodge Ram" , "red", 2002));
        cars.add(new Car("Toyota RAW4" , "white", 2007));
        cars.add(new Car("Mitsubishi Pajero" , "darkgreen", 2000));

        int countCars = new CarServiceImp().countCar(cars);
        model.addAttribute("cars", cars.subList(0, (count instanceof Integer && count > 0 && count < countCars)? count : countCars));
        return "cars/cars";
    }
}
