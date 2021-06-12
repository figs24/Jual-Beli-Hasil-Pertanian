/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.ModLogin;
import Model.ModRegister;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import koneksi.KoneksiDB;

/**
 *
 * @author fhrz
 */
public class DAOLogin implements ImpLogin {
    Connection connection;
    final String Login = "Login INTO login(username,password) VALUES (?,?)";
    final String Register = "Register FROM login(username,password) VALUES (?,?)";
    
    public DAOLogin(){
        connection = KoneksiDB.connection();
    }

    @Override
    public void login(ModLogin mb) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<ModLogin> register(ModLogin mb) {
        List<ModLogin> lmb=null;
        try {
            lmb=new ArrayList<ModLogin>();
            Statement st = connection.createStatement();
            
            ResultSet rs=st.executeQuery(Login);
            while(rs.next()){
                ModLogin mb=new ModLogin();
                mb.setUsername(rs.getString("Username"));
                mb.setPassword(rs.getString("Password"));
                lmb.add(mb);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return lmb; 
    }
    

    @Override
    public List<ModLogin> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ModLogin> getUser(String username) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
