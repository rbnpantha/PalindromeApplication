package com.cirrus.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

/**
 * Created by Rabin on 6/7/2017.
 */
public class PalindromeController {
    @FXML
    private AnchorPane LoginLayout;
    @FXML
    private Label lowerBoundary;

    @FXML
    private Label upperBoundary;

    @FXML
    private Button btnLogin;

    @FXML
    private TextField lower;

    @FXML
    private TextField higher;

    @FXML
    private Label result;

    @FXML
    private Label error;

    public void search(ActionEvent event) throws Exception {
    }


}
