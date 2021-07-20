package org.afpa.gui;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

import java.util.ArrayList;

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
    public TextArea ecran;
    private final ArrayList<Integer> numList = new ArrayList<>();

    public void add(ActionEvent actionEvent) {
        Button btn = (Button) actionEvent.getSource();
        String strBtn = btn.getText();


        switch (strBtn){
            case  "0","1","2","3","4","5","6","7","8","9"->{
                ecran.appendText("+"+strBtn);
                numList.add(Integer.valueOf(strBtn));
//                System.out.println(numList);
            }
            case "Calculer" ->{
                Integer sum = 0;
                for (Integer i: numList) {
                    sum += i ;
                }
                ecran.setText(String.valueOf(sum));
            }
            case "Vider" ->{
                ecran.clear();
                numList.clear();
            }
            default -> ecran.setText("Error");
        }
    }
}
