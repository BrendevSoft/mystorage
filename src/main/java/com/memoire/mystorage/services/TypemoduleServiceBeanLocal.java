/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.memoire.mystorage.services;


import com.memoire.mystorage.entities.Typemodule;
import com.memoire.mystorage.services.core.mystorageServiceBeanLocal;
import javax.ejb.Local;

/**
 *
 * @author Armel
 */
@Local
public interface TypemoduleServiceBeanLocal extends mystorageServiceBeanLocal<Typemodule, Integer> {
    
}
