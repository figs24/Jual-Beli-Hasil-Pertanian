/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.DAORegister;
import DAO.ImpRegister;
import Model.ModRegister;
import Model.TblRegister;
import Register.FormRegister;
import java.util.List;

/**
 *
 * @author fhrz
 */
public class ControllerRegister {
    FormRegister frame;
    ImpRegister ImpRegister;
    List<ModRegister> lmb;

    public ControllerRegister(FormRegister frame, ImpRegister ImpRegister, List<ModRegister> lmb) {
        this.frame = frame;
        ImpRegister = new DAORegister();
        lmb = ImpRegister.getuser();
    }
    
    public void user(){
        frame.getTf_User().setText("");
        frame.getTf_Pass().setText("");
        frame.getTf_Repass().setText("");
        frame.getTf_Jk().setText("");
        frame.getTf_Email().setText("");
        frame.getTf_Notlp().setText("");
        frame.getTf_Almt().setText("");
    }
}
    
