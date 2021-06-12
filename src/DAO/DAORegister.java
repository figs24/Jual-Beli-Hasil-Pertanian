/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.MdBrg;
import Model.ModRegister;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import koneksi.KoneksiDB;

/**
 *
 * @author fhrz
 */
public class DAORegister implements ImpRegister {
    
    Connection connection;
    final String simpan = "SIMPAN INTO register(user,pass,repass,jk,email,notlp,almt) VALUES (?,?,?,?,?,?,?)";   

    public DAORegister(){
        connection = KoneksiDB.connection();
    }

    @Override
    public void simpan(ModRegister mb) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ModRegister> getuser(String user) {
        List<ModRegister> lmb=null;
        try {
            lmb=new ArrayList<ModRegister>();
            Statement st = connection.createStatement();
            
            ResultSet rs=st.executeQuery(simpan);
            while(rs.next()){
                ModRegister mb=new ModRegister();
                mb.setUser(rs.getString("user"));
                mb.setPass(rs.getString("pass"));
                mb.setRepass(rs.getString("repass"));
                mb.setJk(rs.getString("jk"));
                mb.setNotlp(rs.getInt("notlp"));
                mb.setEmail(rs.getString("email"));
                mb.setAlmt(rs.getString("almt"));
                lmb.add(mb);
            }
        } catch (SQLException ex) {
        }
        return lmb; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ModRegister> getuser() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}
