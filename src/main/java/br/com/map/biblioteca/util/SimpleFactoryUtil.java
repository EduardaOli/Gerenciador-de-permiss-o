package br.com.map.biblioteca.util;

import br.com.map.biblioteca.model.Grupo;
import br.com.map.biblioteca.model.Permissao;
import br.com.map.biblioteca.model.Usuario;

/**
 * Simple Factory.
 *
 * @author Eduarda
 */
public final class SimpleFactoryUtil {

  public static final Permissao criarPermissao() {
    return new Permissao();
  }

  public static final Grupo criarGrupo(){
   return new Grupo();
  }
  
   public static final Usuario criarUsuario(){
   return new Usuario();
  }
}
