package rel;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class ListagemCC {
  public ListagemCC() throws Exception {
    new SwingEngine(this).render("rel/ListagemCC.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new ListagemCC();
  }
}
