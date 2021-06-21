/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.DAOLogin;
import DAO.ImpLogin;
import Login.Login;
import Model.ModLogin;
import java.util.List;

/**
 *
 * @author fhrz
 */
public class ControllerLogin {
    Login frame;
    ImpLogin implLogin;
    List<ModLogin> lmb;
    
    public ControllerLogin(Login frame){
        this.frame = frame;
        implLogin = new DAOLogin();
        lmb = implLogin.getAll();
    }
    
}
