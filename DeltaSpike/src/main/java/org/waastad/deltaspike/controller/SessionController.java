/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.waastad.deltaspike.controller;

import java.io.Serializable;
import java.util.Date;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 *
 * @author helge
 */
public class SessionController implements Serializable {

    private static final long serialVersionUID = -5231094879952240971L;
    private long customerId;
    
    @PostConstruct
    public void construct() {
        System.out.println("SessionController postconstruct: " + new Date());
    }
    
    @PreDestroy
    public void destroy(){
        System.out.println("SessionController postdestroy: " + new Date());
    }
    
    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

}
