/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sample.view;

import com.sample.domain.FunctionsForCategory;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Wittakarn
 */
@ViewScoped
@ManagedBean(name = "profileConf")
public class ProfileConf {
    private List<FunctionsForCategory> categorys;
    private List<FunctionsForCategory> selectedFunctions;
    
    public ProfileConf(){
        categorys = new ArrayList<FunctionsForCategory>();
        categorys.add(new FunctionsForCategory("A", "type A"));
        categorys.add(new FunctionsForCategory("B", "type B"));
        categorys.add(new FunctionsForCategory("C", "type C"));
        categorys.add(new FunctionsForCategory("D", "type D"));
    }

    public List<FunctionsForCategory> getCategorys() {
        return categorys;
    }

    public void setCategorys(List<FunctionsForCategory> categorys) {
        this.categorys = categorys;
    }

    public List<FunctionsForCategory> getSelectedFunctions() {
        return selectedFunctions;
    }

    public void setSelectedFunctions(List<FunctionsForCategory> selectedFunctions) {
        this.selectedFunctions = selectedFunctions;
    }
    
    public void functionsForCategory(){
        System.out.println("size of selectedFunctions = " + selectedFunctions.size());
    }
    
    public void submit(){
        System.out.println("size of selectedFunctions = " + selectedFunctions.size());
    }
}
