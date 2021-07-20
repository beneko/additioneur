package org.afpa.controller;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;

public class FormController {

    public Button zero;
    public Button one;
    public Button two;
    public Button three;
    public Button four;
    public Button eight;
    public Button seven;
    public Button six;
    public Button five;
    public Button nine;
    public Button vider;
    public Button calculer;

//    public void calculer(ActionEvent actionEvent) {
//    }
//
//    public void vider(ActionEvent actionEvent) {
//    }

    public void addNum(ActionEvent actionEvent) {
        Button num = (Button) actionEvent.getSource();
        System.out.println(num);
    }
}
