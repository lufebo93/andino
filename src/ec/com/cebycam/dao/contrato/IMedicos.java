/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.cebycam.dao.contrato;

import ec.com.cebycam.rnegocio.entidades.Medicos;
import java.util.List;

/**
 *
 * @author lufeb
 */
public interface IMedicos {
    List<Medicos> obtener()throws Exception; 
}
