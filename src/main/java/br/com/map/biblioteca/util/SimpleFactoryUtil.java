package br.com.map.biblioteca.util;

import br.com.map.biblioteca.model.Permissao;

/**
 * Simple Factory.
 *
 * @author Eduarda
 */
public final class SimpleFactoryUtil {

  public static final Permissao criarPermissao() {
    return new Permissao();
  }

}
