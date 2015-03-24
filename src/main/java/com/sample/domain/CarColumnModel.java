/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sample.domain;

import java.io.Serializable;

/**
 *
 * @author Wittakarn
 */
public class CarColumnModel implements Serializable {

    private String header;
    private String property;

    public CarColumnModel(String header, String property) {
        this.header = header;
        this.property = property;
    }

    public String getHeader() {
        return header;
    }

    public String getProperty() {
        return property;
    }
}
