package org.example;

import org.example.dao.impl.UsuarioDaoImpl;
import org.example.model.Usuario;
import org.example.service.UsuarioService;
import org.example.service.impl.UsuarioServiceImpl;
import org.example.utils.DBConnection;

import java.sql.Connection;
import java.sql.Date;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        DBConnection dbConnection = new DBConnection();
        UsuarioService usuarioService = new UsuarioServiceImpl(new UsuarioDaoImpl(dbConnection.getConnection()));
        Usuario user = new Usuario("Juan","email@gmail.com",(byte)40,"123456");
        //usuarioService.addUser(user);
        List<Usuario> userList = usuarioService.getAllUsers();
        for(Usuario userdb :userList){
            userdb.printUser();
            System.out.println("---------------------------------");
        }

        }
    }
