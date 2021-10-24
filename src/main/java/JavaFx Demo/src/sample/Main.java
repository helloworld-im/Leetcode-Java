package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        Menu CarManufacturers = new Menu("CarManufacturers");
        MenuItem kia = new MenuItem("KIA");
        MenuItem skoda = new MenuItem("SKODA");
        MenuItem toyota = new MenuItem("TOYOTA");
        MenuItem honda = new MenuItem("HONDA");
        CarManufacturers.getItems().addAll(kia,skoda, toyota, honda);

        MenuBar meb = new MenuBar();
        meb.getMenus().add(CarManufacturers);

        Label category = new Label("");
        Label lb = new Label("");

        kia.setOnAction(e -> {
            category.setText("KIA:");
            lb.setText("1. Kia Model 2019\n2. Kia Model 2018\n");
        });

        skoda.setOnAction(e -> {
            category.setText("SKODA:");
            lb.setText("1. Skoda Model 2019\n2. Skoda Model 2018\n");
        });

        toyota.setOnAction(e -> {
            category.setText("TOYOTA:");
            lb.setText("1. toyota Model 2019\n2. Toyota Model 2018\n");
        });

        honda.setOnAction(e -> {
            category.setText("HONDA:");
            lb.setText("1. Honda Model 2019\n2. Honda Model 2018\n");
        });

        BorderPane root = new BorderPane();
        root.setTop(meb);
        root.setLeft(category);
        root.setRight(lb);

        Scene scene = new Scene(root, 400, 400);
        primaryStage.setTitle("Car Manufacturers");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}