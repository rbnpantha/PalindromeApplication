package com.cirrus.controller;

import com.cirrus.service.PalindromeService;
import com.cirrus.serviceImpl.PalindromeServiceImpl;
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

    PalindromeService palindromeService = new PalindromeServiceImpl();

    public void search(ActionEvent event) throws Exception {

        try {
            int lowerBound = Integer.parseInt(lower.getText());
            int upperBound = Integer.parseInt(higher.getText());
            System.out.println(Integer.parseInt(lower.getText()));
            if (lowerBound <= upperBound) {
                error.setText("");
                int palindrome = palindromeService.findPalindrome(upperBound, lowerBound);
                if (palindrome == -1) {
                    result.setText("There is no palindrome in this range !");
                } else {
                    result.setText("The largest palindrome is " + palindrome);
                }
            } else {
                error.setText("Please enter a valid range!");
                result.setText("");
            }
        } catch (Exception e) {
            error.setText("Please enter a valid range !");
        }
    }


}
