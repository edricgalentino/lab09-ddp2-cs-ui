import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.control.*;

import java.util.HashMap;

public class CurrencyConversionFrame extends Application {
    Label labelTitle, labelFrom, labelTo;
    Button convertButton, exitButton;
    ObservableList<String> currency = FXCollections.observableArrayList(
            "Rupiah",
            "Euro",
            "US Dollar"
    );

    HashMap<String, Integer> kurs = new HashMap<String, Integer>();

    @Override
    public void start(final Stage primaryStage){
        kurs.put("Rupiah", 1);
        kurs.put("Euro", 15000);
        kurs.put("US Dollar", 14000);

        primaryStage.setTitle("Currency Converter");

        // TO DO: Menentukan layout dan size yang ingin digunakan


        labelTitle = new Label("Welcome to Currency Converter");
        labelFrom = new Label("From");
        labelTo = new Label("To");

        // TO DO: Membuat Panel sesuai kebutuhan


        // TO DO: Membuat dropdown menu


        // TO DO: Membuat textfield


        convertButton = new Button("Convert");
        exitButton = new Button("Exit");


        // TO DO: Masukkan widget ke panel yang tepat


        // TO DO: Masukkan panel ke dalam frame

        primaryStage.show();

        convertButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                // TO DO: implementasikan pemanggilan method ConvertCurrency

            }
        });

        exitButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                // TO DO: hentikan eksekusi program

            }
        });
    }

    // Method converter
    public String ConvertCurrency(String originalValue, String tipeCurrencyFrom, String tipeCurrencyTo) {
        double value = Double.valueOf(originalValue);
        double fromValue = value * kurs.get(tipeCurrencyFrom);
        double convertedValue = fromValue / kurs.get(tipeCurrencyTo);
        return String.format("%.2f", convertedValue);
    }


    public static void main(String[] args) {
        launch(args);
    }
}

