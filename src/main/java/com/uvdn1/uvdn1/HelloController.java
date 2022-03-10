package com.uvdn1.uvdn1;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.stage.FileChooser;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    public Label status;
    public Label sporocilo;
    public ComboBox mesto;
    public Spinner spinner;
    public TextField besedilo;
    public RadioButton operacija;
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

    public void initialize(URL location, ResourceBundle resources) {
        mesto.getItems().addAll("Slovenj Gradec", "Ljubljana", "Celje", "Maribor", "Koper");
        spinner.setValueFactory(new SpinnerValueFactory.DoubleSpinnerValueFactory(1, 20, 1, 1));
    }

    public void izvedi(ActionEvent actionEvent) {
        if(besedilo.getText().equals("")) {
            return;
        }
        else {
            if(dvojniki.isSelected()) {
                System.out.println(mesto.getValue());
            }

            mesto.getItems().addAll(besedilo.getText());
        }
    }
}