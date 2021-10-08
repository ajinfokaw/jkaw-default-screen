package rel;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class ListagemAtendimento {
  public ListagemAtendimento() throws Exception {
    new SwingEngine(this).render("rel/ListagemAtendimento.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new ListagemAtendimento();
  }
}
