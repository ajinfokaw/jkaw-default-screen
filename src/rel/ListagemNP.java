package rel;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class ListagemNP {
  public ListagemNP() throws Exception {
    new SwingEngine(this).render("rel/ListagemNP.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new ListagemNP();
  }
}
