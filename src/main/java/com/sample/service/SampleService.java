/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sample.service;

import com.sample.model.Response;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Wittakarn
 */
@WebService(serviceName = "SampleService", targetNamespace="http://service.sample.com")
public class SampleService {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public Response hello(@WebParam(name = "hname", targetNamespace="http://service.sample.com") String hname) {
        return new Response("Hello sir " + hname + " !");
    }
}
