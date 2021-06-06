/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.MdBrg;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Luis Figo
 */
public class DAOBrg implements ImpBrg{
    Connection connection;
    final String jual="INSERT INTO barang(namaBrg,jumlah,harga) VALUES (?,?,?)";
    final String beli="DELETE FROM barang WHERE no=?";
    final String update="UPDATE barang set namaBrg=?,jumlah=?,harga=? WHERE kode=?";
    final String select="SELECT * FROM barang";
    final String cari="SELECT * FROM barang WHERE nama like ?";

    @Override
    public void jual(MdBrg mb) {
        PreparedStatement statement=null;
            try{    
                statement= (PreparedStatement) connection.prepareStatement(jual);
                statement.setString(1,mb.getNamaBrg());
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
    public void beli(int kode) {
        PreparedStatement statement=null;
        try{
            statement=(PreparedStatement) connection.prepareStatement(beli);
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
                statement= (PreparedStatement) connection.prepareStatement(update);
                statement.setString(1,mb.getNamaBrg());
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
            Statement st=connection.createStatement();
            
            ResultSet rs=st.executedQuery(select);
            while(rs.next()){
                MdBrg mb=new MdBrg();
                mb.setKode(rs.getInt("kode"));
                mb.setNamaBrg(rs.getString("namaBrg"));
                mb.setJumlah(rs.getInt("jumlah"));
                mb.setHarga(rs.getDouble("harga"));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return lmb;
    }

    @Override
    public List<MdBrg> getCari(String namaBrg) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static class Statement {

        public Statement() {
        }

        private ResultSet executedQuery(String select) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
}
