/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;

/**
 *
 * @author Gabriel Cunha <gabrielcunhadev@gmail.com>
 */
public interface IPersitencia {
    
    boolean incluir(Object objeto) throws Exception;
    
    List<Object> listar() throws Exception;
    
}
