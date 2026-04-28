package org.example.service.impl;

import org.example.dao.UsuarioDao;
import org.example.model.Usuario;
import org.example.service.UsuarioService;

import java.util.List;

public class UsuarioServiceImpl implements UsuarioService {
    UsuarioDao usuarioDao;

    public UsuarioServiceImpl(UsuarioDao usuarioDao){this.usuarioDao = usuarioDao;}


    @Override
    public void addUser(Usuario usuario) {
        usuarioDao.agregarUsuario(usuario);
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void upadte(Usuario usuario) {

    }

    @Override
    public Usuario getByid(int id) {
        return null;
    }

    @Override
    public List<Usuario> getAllUsers() {return usuarioDao.getAll();}
}
