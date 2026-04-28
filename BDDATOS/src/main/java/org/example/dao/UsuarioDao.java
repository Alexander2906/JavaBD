package org.example.dao;

import org.example.model.Usuario;

import java.util.List;

public interface UsuarioDao {
    public void agregarUsuario(Usuario usuario);
    public void eliminar(int id);
    public void update(Usuario usuario);
    public Usuario getByid(int id);
    public List<Usuario> getAll();
}
