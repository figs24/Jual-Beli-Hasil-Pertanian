/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.MdBrg;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import koneksi.KoneksiDB;

/**
 *
 * @author Luis Figo
 */
public class DAOBrg implements ImpBrg{
    Connection connection;
    final String insert="INSERT INTO pbo_pertanian(nama_barang,jumlah,harga) VALUES (?,?,?)";
    final String delete="DELETE FROM pbo_pertanian WHERE no=?";
    final String update="UPDATE pbo_pertanian set nama_barang=?,jumlah=?,harga=? WHERE kode=?";
    final String select="SELECT * FROM pbo_pertanian";
    final String cari="SELECT * FROM pbo_pertanian WHERE nama_barang like ?";

    public DAOBrg() {
        connection = KoneksiDB.Connection();
    }
    

    @Override
    public void insert(MdBrg mb) {
        PreparedStatement statement=null;
            try{    
                statement=connection.prepareStatement(insert);
                statement.setString(1,mb.getNama_barang());
                statement.setInt(2,mb.getJumlah());
                statement.setDouble(3,mb.getHarga());
                statement.executeUpdate();
                ResultSet rs=statement.getGeneratedKeys();
                while (rs.next()){
                    mb.setKode(rs.getInt(1));
                }
            }catch (SQLException ex){
                ex.printStackTrace();
            }finally{
                try{
                    statement.close();
                }catch(SQLException ex){
                    ex.printStackTrace();
                }
            }
    }

    @Override
    public void delete(int kode) {
        PreparedStatement statement=null;
        try{
            statement=connection.prepareStatement(delete);
            statement.setInt(1, kode);
            statement.executeUpdate();
        }catch (SQLException ex){
            ex.printStackTrace();
        }finally{
                try{
                    statement.close();
                }catch(SQLException ex){
                    ex.printStackTrace();
            }
        }
    }
    @Override
    public void update(MdBrg mb) {
        PreparedStatement statement=null;
            try{    
                statement=connection.prepareStatement(update);
                statement.setString(1,mb.getNama_barang());
                statement.setInt(2,mb.getJumlah());
                statement.setDouble(3,mb.getHarga());
                statement.setDouble(4,mb.getKode());
                statement.executeUpdate();
            }catch (SQLException ex){
                ex.printStackTrace();
            }finally{
                try{
                    statement.close();
                }catch(SQLException ex){
                    ex.printStackTrace();
                }
            }
    }

    @Override
    public List<MdBrg> getAll() {
        List<MdBrg> lmb=null;
        try {
            lmb=new ArrayList<MdBrg>();
            Statement st = connection.createStatement();
            
            ResultSet rs=st.executeQuery(select);
            while(rs.next()){
                MdBrg mb=new MdBrg();
                mb.setKode(rs.getInt("kode"));
                mb.setNama_barang(rs.getString("nama_barang"));
                mb.setJumlah(rs.getInt("jumlah"));
                mb.setHarga(rs.getDouble("harga"));
                lmb.add(mb);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return lmb;
    }

    @Override
    public List<MdBrg> getCari(String nama_barang) {
        List<MdBrg> lmb=null;
        try{
            lmb=new ArrayList<MdBrg>();
            PreparedStatement st=connection.prepareStatement(cari);
            st.setString(1,"%"+nama_barang+"%");
            ResultSet rs=st.executeQuery();
            while(rs.next()){
                MdBrg mb=new MdBrg();
                mb.setKode(rs.getInt("kode"));
                mb.setNama_barang(rs.getString("nama_barang"));
                mb.setJumlah(rs.getInt("jumlah"));
                mb.setHarga(rs.getDouble("harga"));
                lmb.add(mb);
                
            }
        }catch(SQLException ex){
            ex.printStackTrace();
        }
    return lmb;
    }
}
