package rel;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class ListagemMovtoConta {
  public ListagemMovtoConta() throws Exception {
    new SwingEngine(this).render("rel/ListagemMovtoConta.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new ListagemMovtoConta();
  }
}
