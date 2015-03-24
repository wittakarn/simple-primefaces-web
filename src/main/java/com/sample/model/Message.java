/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sample.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Wittakarn
 */
public class Message implements Serializable{
    private List<String> result;
    
    public Message(){
        result = new ArrayList<String>();
    }

    public List<String> getResult() {
        return result;
    }

    public void setResult(List<String> result) {
        this.result = result;
    }

    @Override
    public String toString() {
        
        return "Message{" + "result=" + Arrays.toString(result.toArray()) + '}';
    }
    
}
