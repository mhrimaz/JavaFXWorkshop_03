/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxworkshop_03;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 *
 * @author mhrimaz
 */
public class FXMLDocumentController {

    @FXML
    private TextField displayField;
    
    CalculatorEngine engine;

    @FXML
    private void handleNumericButtonAction(ActionEvent event) {
        Button source = (Button) event.getSource();
        String text = source.getText();
        displayField.appendText(text);
    }

    @FXML
    private void handleOperatorButtonAction(ActionEvent event) {
       
    }

}
