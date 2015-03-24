/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sample.service;

import com.sample.model.Message;
import java.util.ArrayList;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;

/**
 *
 * @author Wittakarn
 */
@WebService(serviceName = "ProvinceService", targetNamespace="http://service.sample.com")
public class ProvinceService {

    /**
     * This is a sample web service operation
     * @return list of provices
     */
    @WebMethod(operationName = "get")
    public Message getProvince() {
        List<String> provinces = new ArrayList<String>();
        provinces.add("กรุงเทพฯ");
        provinces.add("กำแพงเพชร");
        provinces.add("กระบี่");
        provinces.add("ขอนแก่น");
        provinces.add("เชียงราย");
        provinces.add("ระยอง");
        
        Message message = new Message();
        message.setResult(provinces);
        
        return message;
    }
}
