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
 * @author Luis Figo
 */
public class TblBrg extends AbstractTableModel {
    
    List<MdBrg>lmb;

    public TblBrg(List<MdBrg> lab) {
        this.lmb = lmb;
    }

    @Override
    public int getRowCount() {
        return lmb.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int row, int column) {
        switch(column){
            case 0:
                return lmb.get(row).getKode();
            case 1:
                return lmb.get(row).getNamaBrg();
            case 2:
                return lmb.get(row).getJumlah();
            case 3:
                return lmb.get(row).getHarga();
            default:
                return null;
        }
        
    }

    @Override
    public String getColumnName(int column) {
        switch(column){
            case 0:
                return "Kode";
            case 1:
                return "Nama Barang";
            case 2:
                return "Jumlah";
            case 3:
                return "Harga";
            default:
                return null;
        }
    }
    
    
}
