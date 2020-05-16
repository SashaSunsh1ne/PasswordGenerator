package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import model.*;

import java.net.URL;
import java.util.ArrayList;
import java.util.Random;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    public ChoiceBox length;
    public ChoiceBox count;
    public CheckBox rus;
    public CheckBox rusUpper;
    public CheckBox eng;
    public CheckBox engUpper;
    public CheckBox nums;
    public CheckBox symbols;
    public ListView list;
    public TextField passwordToCode;
    public TextField codedPassword;
    public TextField codeToPassword;
    public TextField casualPassword;
    public Random random = new Random();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        length.getItems().addAll(15, 20, 25, 30, 35, 40);
        count.getItems().addAll(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        length.setValue(20);
        count.setValue(1);
    }

    public void generate(ActionEvent actionEvent) {
        if (rus.isSelected() || rusUpper.isSelected() || eng.isSelected() || engUpper.isSelected() || nums.isSelected() || symbols.isSelected()) {
            list.getItems().clear();
            ArrayList<Filter> filters = new ArrayList<>();
            int i = 1;
            while (i <= (int) count.getValue()) {
                if (rus.isSelected())
                    filters.add(new FilterRus());
                if (rusUpper.isSelected())
                    filters.add(new FilterRusUpper());
                if (eng.isSelected())
                    filters.add(new FilterEng());
                if (engUpper.isSelected())
                    filters.add(new FilterEngUpper());
                if (nums.isSelected())
                    filters.add(new FilterNums());
                if (symbols.isSelected())
                    filters.add(new FilterSymbols());
                PasswordGenerator passwordGenerator = new PasswordGenerator((int) length.getValue(), filters);
                list.getItems().add(passwordGenerator.createPassword());
                i++;
            }
        }
    }

    public void code(ActionEvent actionEvent) {
        if (passwordToCode.getText().length() > 0) {
            PasswordGenerator passwordGenerator = new PasswordGenerator(passwordToCode.getText(), new FilterCode());
            codedPassword.setText(passwordGenerator.createPassword());
        }
    }

    public void decode(ActionEvent actionEvent) {
        if (codeToPassword.getText().length() > 0) {
            PasswordGenerator passwordGenerator = new PasswordGenerator(codeToPassword.getText(), new FilterDecode());
            casualPassword.setText(passwordGenerator.createPassword());
        }
    }
}
