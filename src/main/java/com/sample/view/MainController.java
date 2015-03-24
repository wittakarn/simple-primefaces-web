/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sample.view;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.event.ActionEvent;

/**
 *
 * @author Wittakarn
 */
@ViewScoped
@ManagedBean(name = "mainController")
public class MainController implements Serializable {
    private String testparam;
    private String currentXCoordinate;
    private String currentYCoordinate;
    private String currentPositionDescription;
    private String currentReason;
    private String currentRatingImportance;
    private String currentNumberOfChargingPoints;
    private String currentChargingStandard;
    private String currentRating1;
    private String currentRating2;
    private String currentRating3;
    private String currentId;
    
    public MainController(){}

    public String getTestparam() {
        return testparam;
    }

    public void setTestparam(String testparam) {
        this.testparam = testparam;
    }

    public String getCurrentXCoordinate() {
        return currentXCoordinate;
    }

    public void setCurrentXCoordinate(String currentXCoordinate) {
        this.currentXCoordinate = currentXCoordinate;
    }

    public String getCurrentYCoordinate() {
        return currentYCoordinate;
    }

    public void setCurrentYCoordinate(String currentYCoordinate) {
        this.currentYCoordinate = currentYCoordinate;
    }

    public String getCurrentPositionDescription() {
        return currentPositionDescription;
    }

    public void setCurrentPositionDescription(String currentPositionDescription) {
        this.currentPositionDescription = currentPositionDescription;
    }

    public String getCurrentReason() {
        return currentReason;
    }

    public void setCurrentReason(String currentReason) {
        this.currentReason = currentReason;
    }

    public String getCurrentRatingImportance() {
        return currentRatingImportance;
    }

    public void setCurrentRatingImportance(String currentRatingImportance) {
        this.currentRatingImportance = currentRatingImportance;
    }

    public String getCurrentNumberOfChargingPoints() {
        return currentNumberOfChargingPoints;
    }

    public void setCurrentNumberOfChargingPoints(String currentNumberOfChargingPoints) {
        this.currentNumberOfChargingPoints = currentNumberOfChargingPoints;
    }

    public String getCurrentChargingStandard() {
        return currentChargingStandard;
    }

    public void setCurrentChargingStandard(String currentChargingStandard) {
        this.currentChargingStandard = currentChargingStandard;
    }

    public String getCurrentRating1() {
        return currentRating1;
    }

    public void setCurrentRating1(String currentRating1) {
        this.currentRating1 = currentRating1;
    }

    public String getCurrentRating2() {
        return currentRating2;
    }

    public void setCurrentRating2(String currentRating2) {
        this.currentRating2 = currentRating2;
    }

    public String getCurrentRating3() {
        return currentRating3;
    }

    public void setCurrentRating3(String currentRating3) {
        this.currentRating3 = currentRating3;
    }

    public String getCurrentId() {
        return currentId;
    }

    public void setCurrentId(String currentId) {
        this.currentId = currentId;
    }
    
    public void saveData(ActionEvent event){
        System.out.println("saveData");
    }
}
