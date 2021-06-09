/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.DAOBrg;
import DAO.ImpBrg;
import Model.MdBrg;
import Model.TblBrg;
import Pview.DafPesanan;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Luis Figo
 */
public class ControllerBrg {
    DafPesanan frame;
    ImpBrg implBarang;
    List<MdBrg> lmb;

    public ControllerBrg(DafPesanan frame) {
        this.frame = frame;
        implBarang = new DAOBrg();
        lmb =implBarang.getAll();
    }
    
    public void reset(){
        frame.getTf_kode().setText("");
        frame.getTf_nama().setText("");
        frame.getTf_jumlah().setText("");
        frame.getTf_harga().setText("");
    }
    public void isiTable(){
        lmb=implBarang.getAll();
        TblBrg mtb=new TblBrg(lmb);
        frame.getTb_data().setModel(mtb);
    }
    public void isField(int row){
        frame.getTf_kode().setText(String.valueOf(lmb.get(row).getKode()));
        frame.getTf_nama().setText(lmb.get(row).getNama_barang());
        frame.getTf_jumlah().setText(String.valueOf(lmb.get(row).getJumlah()));
        frame.getTf_harga().setText(String.valueOf(lmb.get(row).getHarga()));
    }
    public void jual(){
        if(!frame.getTf_nama().getText().trim().isEmpty() & !frame.getTf_nama().getText().trim().isEmpty()){
            MdBrg mb=new MdBrg();
            mb.setNama_barang(frame.getTf_nama().getText());
            mb.setJumlah(Integer.valueOf(frame.getTf_jumlah().getText()));
            mb.setHarga(Double.valueOf(frame.getTf_harga().getText()));
            
            implBarang.jual(mb);
            JOptionPane.showMessageDialog(null,"Data Barang Telah Masuk Bursa penjualan!");
        }else{
            JOptionPane.showMessageDialog(null,"Proses GAGAL!!COBA LAGI!!!");
        }
    }
    public void beli(){
        if(!frame.getTf_kode().getText().trim().isEmpty()){
            int kode=Integer.parseInt(frame.getTf_kode().getText());
            
            implBarang.beli(kode);
            JOptionPane.showMessageDialog(null,"Barang Telah di Beli!!");
        }else{
            JOptionPane.showMessageDialog(null,"Proses GAGAL!!COBA LAGI!!!");
        }
            
        }
        public void update(){
        if(!frame.getTf_kode().getText().trim().isEmpty()){
            MdBrg mb=new MdBrg();
            mb.setKode(Integer.valueOf(frame.getTf_kode().getText()));
            mb.setNama_barang(frame.getTf_nama().getText());
            mb.setJumlah(Integer.valueOf(frame.getTf_jumlah().getText()));
            mb.setHarga(Double.valueOf(frame.getTf_harga().getText()));
            
            implBarang.update(mb);
            JOptionPane.showMessageDialog(null,"Barang Telah di Beli!!");
        }else{
            JOptionPane.showMessageDialog(null,"Proses GAGAL!!COBA LAGI!!!");
        }
        }
        public void isiTblCariNama(){
            lmb=implBarang.getCari(frame.getTf_cari().getText());
            TblBrg mtb=new TblBrg(lmb);
            frame.getTb_data().setModel(mtb);
        }
        public void cariNama(){
            if(!frame.getTf_cari().getText().trim().isEmpty()){
                implBarang.getCari(frame.getTf_cari().getText());
                isiTblCariNama();
            }else{
                JOptionPane.showMessageDialog(null,"Pencarian GAGAL!!COBA LAGI!!!");
            }
        }
}
