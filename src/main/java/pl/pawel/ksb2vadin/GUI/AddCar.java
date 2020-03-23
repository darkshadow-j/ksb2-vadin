package pl.pawel.ksb2vadin.GUI;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import org.springframework.beans.factory.annotation.Autowired;
import pl.pawel.ksb2vadin.model.Car;
import pl.pawel.ksb2vadin.service.CarService;

@Route("add-car")
public class AddCar extends VerticalLayout {

    CarService carService;


    @Autowired
    public AddCar(CarService carService) {

        TextField textFieldModel = new TextField();
        textFieldModel.setPlaceholder("Model");
        TextField textFieldMark = new TextField();
        textFieldMark.setPlaceholder("masrk");
        Button button = new Button("Add car");
        button.addClickListener(event -> {
            System.out.println("Enter");
            carService.AddCar(new Car(textFieldMark.getValue(), textFieldModel.getValue()));
            System.out.println(carService.getCarList());
        });
        add(textFieldMark, textFieldModel, button);

    }
}
