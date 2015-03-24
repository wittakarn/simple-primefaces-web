/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sample.view;

import com.sample.domain.Car;
import com.sample.domain.CarColumnModel;
import com.sample.model.LazyCarDataModel;
import com.sample.service.CarService;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.event.ActionEvent;
import org.primefaces.event.SelectEvent;
import org.primefaces.event.ToggleSelectEvent;
import org.primefaces.event.UnselectEvent;
import org.primefaces.event.data.PageEvent;
import org.primefaces.model.LazyDataModel;

/**
 *
 * @author Wittakarn
 */
@ViewScoped
@ManagedBean(name = "ld")
public class LazyDataTableBean implements Serializable {

    private LazyDataModel<Car> lazyModel;
    
    private List<CarColumnModel> columns;

    private List<Car> selectedCars;

    private List<Car> dummyCars;

    @ManagedProperty("#{carService}")
    private CarService service;

    @PostConstruct
    public void init() {
        lazyModel = new LazyCarDataModel(service.createCars(500));
        selectedCars = new ArrayList<Car>();
        columns = new ArrayList<CarColumnModel>();
        
        columns.add(new CarColumnModel("Field1", "id"));
        columns.add(new CarColumnModel("Field2", "brand"));
        columns.add(new CarColumnModel("Field3", "year"));
        columns.add(new CarColumnModel("Field4", "color"));
    }

    public LazyDataModel<Car> getLazyModel() {
        return lazyModel;
    }

    public List<Car> getSelectedCars() {
        return selectedCars;
    }

    public void setSelectedCars(List<Car> selectedCars) {
        this.selectedCars = selectedCars;
    }

    public List<Car> getDummyCars() {
        return dummyCars;
    }

    public void setDummyCars(List<Car> dummyCars) {
        this.dummyCars = dummyCars;
    }

    public void setService(CarService service) {
        this.service = service;
    }

    public void managePage(PageEvent event) {
        dummyCars.clear();

        for (Car car : selectedCars) {
            dummyCars.add(car);
        }
    }

    public void manageToggle(ToggleSelectEvent event) {
        System.out.println("manageToggle");
        for (Car car : (List<Car>) lazyModel.getWrappedData()) {
            selectedCars.remove(car);
        }

        System.out.println("toggle has been selected= " + event.isSelected());
        if (event.isSelected()) {
            for (Car car : (List<Car>) lazyModel.getWrappedData()) {
                selectedCars.add(car);
            }
        }
    }
    
    public void manageRowSelect(SelectEvent event) {
        for (Car car : (List<Car>) lazyModel.getWrappedData()) {
            selectedCars.remove(car);
        }
        
        System.out.println("manageRowSelect");
        selectedCars.add((Car) event.getObject());
    }

    public void manageSelect(SelectEvent event) {      
        System.out.println("manageSelect");
        selectedCars.add((Car) event.getObject());
    }

    public void manageUnselect(UnselectEvent event) {
        System.out.println("manageUnselect");
        Car unselectedCar = (Car) event.getObject();
        selectedCars.remove(unselectedCar);
    }

    public void submit(ActionEvent event) {
        managePage(null);
        System.out.println("size of selectedCars = " + selectedCars.size());
    }

    public List<CarColumnModel> getColumns() {
        return columns;
    }

    public void setColumns(List<CarColumnModel> columns) {
        this.columns = columns;
    }
    
}
