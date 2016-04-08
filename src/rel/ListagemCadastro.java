package rel;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class ListagemCadastro {
  public ListagemCadastro() throws Exception {
    new SwingEngine(this).render("rel/ListagemCadastro.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new ListagemCadastro();
  }
}
