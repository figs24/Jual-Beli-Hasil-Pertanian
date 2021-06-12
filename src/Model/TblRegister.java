/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author fhrz
 */
public class TblRegister extends AbstractTableModel  {

    List<ModRegister> lmb;

    public TblRegister(List<ModRegister> lmb) {
        this.lmb = lmb;
    }
    
    
    
    
    @Override
    public int getRowCount() {
        return lmb.size();
         //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getColumnCount() {
        return 7; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object getValueAt(int i, int column) {
        switch(column){
            case 0:
                return lmb.get(i).getUser();
            case 1:
                return lmb.get(i).getPass();
            case 2:
                return lmb.get(i).getRepass();
            case 3:
                return lmb.get(i).getJk();
            case 4:
                return lmb.get(i).getEmail();    
            case 5:
                return lmb.get(i).getNotlp();    
            case 6:
                return lmb.get(i).getAlmt();   
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        switch(column){
            case 0:
                return "User";
            case 1:
                return "Pass";
            case 2:
                return "Repass";
            case 3:
                return "Jk";
            case 4:
                return "Email";
            case 5:
                return "Notlp";
            case 6:
                return "Almt";
            default:
                return null;
        }
         //To change body of generated methods, choose Tools | Templates.
    }
    
}    