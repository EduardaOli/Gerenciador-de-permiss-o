package br.com.map.biblioteca.dao;

import br.com.map.biblioteca.exception.DaoException;
import java.util.List;
import org.hibernate.Criteria;

/**
 *
 *
 * @author Eduarda
 * @param <T> Objeto
 */
public interface IDaoGeneric<T> {

  void save(T t) throws DaoException;

  void update(T t) throws DaoException;

  void remove(T t, long id) throws DaoException;

  T find(long id) throws DaoException;

  List<T> all() throws DaoException;

  Criteria getCriteria();

}
