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
import java.util.List;

/**
 *
 * @author Luis Figo
 */
public class DAOBrg implements ImpBrg{
    Connection connection;
    final String jual="INSERT INTO barang(namaBrg,jumlah,harga) VALUES (?,?,?)";
    final String beli="DELETE FROM barang WHERE no=?";
    //final String select="SELECT * FROM barang";
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<MdBrg> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<MdBrg> getCari(String namaBrg) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
