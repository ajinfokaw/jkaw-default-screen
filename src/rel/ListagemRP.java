package rel;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class ListagemRP {
  public ListagemRP() throws Exception {
    new SwingEngine(this).render("rel/ListagemRP.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new ListagemRP();
  }
}
