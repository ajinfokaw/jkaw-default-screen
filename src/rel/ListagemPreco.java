package rel;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class ListagemPreco {
  public ListagemPreco() throws Exception {
    new SwingEngine(this).render("rel/ListagemPreco.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new ListagemPreco();
  }
}
