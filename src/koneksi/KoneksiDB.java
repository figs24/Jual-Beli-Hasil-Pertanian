/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koneksi;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Luis Figo
 */
public class KoneksiDB {
    static Connection con;
    public static Connection Connection(){
        if(con==null){
            MysqlDataSource data=new MysqlDataSource();
            data.setDatabaseName("pbo");
            data.setUser("root");
            data.setPassword("");
            
            try {
                con=(Connection) data.getConnection();
            } catch (SQLException ex) {
        //        Logger.getLogger(KoneksiDB.class.getName()).log(Level.SEVERE, null, ex);
                ex.printStackTrace();
            }
        
    }
    return con;
}
}
