/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.DAOLogin;
import DAO.ImpLogin;
import Login.login;
import Model.ModLogin;
import java.util.List;


public class ControllerLogin{
    login frame;
    ImpLogin impLogin;
    List<ModLogin>lmb;
    
    public ControllerLogin(login frame){
        this.frame = frame;
        impLogin = new DAOLogin();
        lmb = impLogin.getAll();
    }
    
    public void login(){
        frame.getTf_user().setText("");
        frame.getTf_pass().setText("");
        
    }
}