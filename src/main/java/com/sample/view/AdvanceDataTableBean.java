/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sample.view;

import com.sample.domain.Car;
import com.sample.service.CarService;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Wittakarn
 */
@ViewScoped
@ManagedBean(name = "ad")
public class AdvanceDataTableBean implements Serializable{
    private List<Car> cars;
    private List<Car> selectedCars;
    
    @ManagedProperty("#{carService}")
    private CarService service;

    public List<Car> getSelectedCars() {
        return selectedCars;
    }

    public void setSelectedCars(List<Car> selectedCars) {
        this.selectedCars = selectedCars;
    }

    @PostConstruct
    public void init() {
        cars = service.createCars(500);
    }
    
    public List<Car> getCars() {
        return cars;
    }

    public void setService(CarService service) {
        this.service = service;
    }
}
