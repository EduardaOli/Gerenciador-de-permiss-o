package br.com.map.biblioteca.exception;

/**
 * Classe responsável por gerenciar Exceções provindas do DAO
 *
 * @author Lucas
 */
public class DaoException extends Exception {

    public DaoException(String msg) {
        super(msg);
    }

}
