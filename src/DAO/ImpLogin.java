/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.ModLogin;
import java.util.List;

/**
 *
 * @author fhrz
 */
public interface ImpLogin {
    public void login(ModLogin mb);
    public void register(ModLogin mb);
    public List<ModLogin>getAll();
    public List<ModLogin>getUser(String username);
}
