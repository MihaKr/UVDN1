package com.uvdn1.uvdn1;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.stage.FileChooser;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    public Label status;
    public Label sporocilo;
    public Label mousePos;
    public ComboBox mesto;
    public Spinner spinner;
    public TextField besedilo;
    public ToggleGroup operacije;
    public CheckBox dvojniki;

    private String vmes;

    public void odpriCB(ActionEvent actionEvent) {
        FileChooser fc = new FileChooser();
        File f = fc.showOpenDialog(null);
    }

    public void izhodCB(ActionEvent actionEvent) {
        System.exit(0);
    }

    public void clearCB(ActionEvent actionEvent) {
        status.setText("status: ");
        sporocilo.setText("Sporočilo: ");
    }

    public void Mclick(ActionEvent actionEvent) {
        vmes = status.getText();
        vmes += "M";
        status.setText(vmes);
    }

    public void Iclick(ActionEvent actionEvent) {
        vmes = status.getText();
        vmes += "I";
        status.setText(vmes);
    }

    public void Hclick(ActionEvent actionEvent) {
        vmes = status.getText();
        vmes += "H";
        status.setText(vmes);
    }

    public void Aclick(ActionEvent actionEvent) {
        vmes = status.getText();
        vmes += "A";
        status.setText(vmes);
    }

    public void Kclick(ActionEvent actionEvent) {
        vmes = status.getText();
        vmes += "K";
        status.setText(vmes);
    }

    public void Rclick(ActionEvent actionEvent) {
        vmes = status.getText();
        vmes += "R";
        status.setText(vmes);
    }

    public void Cclick(ActionEvent actionEvent) {
        vmes = status.getText();
        vmes += "C";
        status.setText(vmes);
    }

    public void Lclick(ActionEvent actionEvent) {
        vmes = status.getText();
        vmes += "L";
        status.setText(vmes);
    }

    public void Eclick(ActionEvent actionEvent) {
        vmes = status.getText();
        vmes += "E";
        status.setText(vmes);
    }

    public void Fclick(ActionEvent actionEvent) {
        vmes = status.getText();
        vmes += "F";
        status.setText(vmes);
    }

    public void Oclick(ActionEvent actionEvent) {
        vmes = status.getText();
        vmes += "O";
        status.setText(vmes);
    }

    public void Tclick(ActionEvent actionEvent) {
        vmes = status.getText();
        vmes += "T";
        status.setText(vmes);
    }

    public void Šclick(ActionEvent actionEvent) {
        vmes = status.getText();
        vmes += "Š";
        status.setText(vmes);
    }

    public  void initialize(URL location, ResourceBundle resources) {
        mesto.getItems().addAll("Slovenj Gradec", "Ljubljana", "Celje", "Maribor", "Koper");
        spinner.setValueFactory(new SpinnerValueFactory.DoubleSpinnerValueFactory(1, 20, 1, 1));


        spinner.valueProperty().addListener((obs, oldValue, newValue) -> {
            double spn = (double) spinner.getValue();
            int spnI = (int) (spn - 1);

            if (!"".equals(newValue)) {

                String mesta = new String(String.valueOf(mesto.getItems()));
                mesta = mesta.substring(1, mesta.length() - 1);
                String [] arr = mesta.split(", ");

                if(spnI < arr.length) {
                    sporocilo.setText("Sporočilo: " + arr[spnI]);
                }
                else {
                    sporocilo.setText("Sporočilo: Ni elementa");

                }

            }
        });
    }

    public void izvedi(ActionEvent actionEvent) {
        RadioButton selectedRadioButton = (RadioButton) operacije.getSelectedToggle();
        String ops = selectedRadioButton.getText();

        String mesta = new String(String.valueOf(mesto.getItems()));
        mesta = mesta.substring(1, mesta.length() - 1);
        String [] arr = mesta.split(", ");

        switch (ops) {
            case "Dodaj":
                if (besedilo.getText().equals("")) {
                    return;
                } else {
                    if (dvojniki.isSelected()) {
                        for (int i = 0; i < arr.length; i++) {
                            if(arr[i].equals(besedilo.getText())) {
                                return;
                            }
                        }
                    }

                    mesto.getItems().addAll(besedilo.getText());
                }
                break;
            case "Odstrani prvega":
                String [] arr2 = new String[arr.length-1];

                for (int i = 0; i < arr.length; i++) {
                    if(i != arr.length-1) {
                        arr2[i] = arr[i + 1];
                    }
                }

                arr = arr2;

                mesto.getItems().clear();
                mesto.getItems().addAll(arr);

                break;
            case "Odstrani izbranega":
                int ind = mesto.getSelectionModel().getSelectedIndex();

                arr2 = new String[arr.length-1];

                for (int i = 0; i < ind; i++) {
                    arr2[i] = arr[i];
                }

                for (int i = ind; i < arr.length; i++) {
                    if(i != arr.length-1) {
                        arr2[i] = arr[i + 1];
                    }
                }

                arr = arr2;

                mesto.getItems().clear();
                mesto.getItems().addAll(arr);

                break;
            }
        sporocilo.setText("Sporočilo: " + ops);
    }

    public void move(MouseEvent mouseEvent) {
        mousePos.setText("Položaj: X:" + mouseEvent.getSceneX() + " " + "Y:" + mouseEvent.getSceneY());
    }
}