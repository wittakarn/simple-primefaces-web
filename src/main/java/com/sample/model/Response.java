/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sample.model;

import java.io.Serializable;

/**
 *
 * @author Wittakarn
 */
public class Response implements Serializable{
    private String result;
    
    public Response(String resp){
        result = resp;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
    
}
