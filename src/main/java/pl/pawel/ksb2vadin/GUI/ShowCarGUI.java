package pl.pawel.ksb2vadin.GUI;

import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import org.springframework.beans.factory.annotation.Autowired;
import pl.pawel.ksb2vadin.model.Car;
import pl.pawel.ksb2vadin.service.CarService;

@Route("show-car")
public class ShowCarGUI extends VerticalLayout {

    CarService carService;

    @Autowired
    public ShowCarGUI(CarService carService) {


        Grid<Car> grid = new Grid<>(Car.class);
        grid.setItems(carService.getCarList());

        add(grid);

    }
}
