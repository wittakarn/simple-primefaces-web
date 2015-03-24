/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sample.domain;

/**
 *
 * @author Wittakarn
 */
public class FunctionsForCategory {
    private String functionCod;
    private String functionDesc;
    
    public FunctionsForCategory(String functionCod, String functionDesc){
        this.functionCod = functionCod;
        this.functionDesc = functionDesc;
    }

    public String getFunctionCod() {
        return functionCod;
    }

    public void setFunctionCod(String functionCod) {
        this.functionCod = functionCod;
    }

    public String getFunctionDesc() {
        return functionDesc;
    }

    public void setFunctionDesc(String functionDesc) {
        this.functionDesc = functionDesc;
    }
}
