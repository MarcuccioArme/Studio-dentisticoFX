package com.armenise.studiodentisticofx;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;

import java.net.URL;
import java.util.ResourceBundle;

public class ListaPazientiController implements Initializable {

    @FXML
    ListView<String> listaPazientiView;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        ObservableList<String> items = FXCollections.observableArrayList ("Primo", "Secondo", "Terzo", "Quarto");
        listaPazientiView.getItems().addAll(items);

    }

}
