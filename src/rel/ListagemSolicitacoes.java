package rel;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class ListagemSolicitacoes {
  public ListagemSolicitacoes() throws Exception {
    new SwingEngine(this).render("rel/ListagemSolicitacoes.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new ListagemSolicitacoes();
  }
}
