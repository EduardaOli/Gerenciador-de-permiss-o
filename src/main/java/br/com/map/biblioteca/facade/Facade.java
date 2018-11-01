/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.map.biblioteca.facade;

import br.com.map.biblioteca.dao.PermissaoDao;
import br.com.map.biblioteca.exception.DaoException;
import br.com.map.biblioteca.model.Permissao;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author lucas
 */
public class Facade {

    PermissaoDao permissaoDao = new PermissaoDao();

    public void salvarPermissao(Permissao p) throws SQLException, DaoException {
        permissaoDao.save(p);

    }

    public List<Permissao> listarPermissoes() throws DaoException {
        return permissaoDao.all();
    }

    public Permissao buscarPermissao(long id) throws DaoException {
        return permissaoDao.find(id);
    }

    public void editarPermissao(Permissao p) throws DaoException {
        permissaoDao.update(p);
    }

    public void removerPermissao(Permissao p, long id) throws DaoException {
        permissaoDao.remove(p, id);
    }

}
