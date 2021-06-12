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
public class TblLogin extends AbstractTableModel{

    List<ModLogin> lmb;
    
    public TblLogin(List<ModLogin> lmb){
        this.lmb = lmb;
    }
    
    @Override
    public int getRowCount() {
        return lmb.size(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getColumnCount() {
        return 2; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object getValueAt(int row, int column) {
        switch(column){
            case 0:
                return lmb.get(row).getUsername();
            case 1:
                return lmb.get(row).getPassword();
            default:
                return null;
        }
        
    }

    @Override
    public String getColumnName(int i) {
        switch(i){
            case 0:
                return "Username";
            case 1:
                return "Password";
            default:
                return null;
        }
        
    }
    
}
