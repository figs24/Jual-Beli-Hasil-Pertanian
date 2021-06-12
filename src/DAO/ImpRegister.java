/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.ModRegister;
import java.util.List;

/**
 *
 * @author fhrz
 */
public interface ImpRegister {
    public void simpan(ModRegister mb);
    public List<ModRegister> getuser(String user);

    public List<ModRegister> getuser();
}
