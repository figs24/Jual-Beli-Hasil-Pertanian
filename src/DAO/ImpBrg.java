/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.MdBrg;
import java.util.List;

/**
 *
 * @author Luis Figo
 */
public interface ImpBrg {
    public void jual(MdBrg mb);
    public void beli(int kode);
    public void update(MdBrg kode);
    public List<MdBrg>getAll();
    public List<MdBrg>getCari(String nama_barang);
    
}
