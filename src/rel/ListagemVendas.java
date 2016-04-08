package rel;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class ListagemVendas {
  public ListagemVendas() throws Exception {
    new SwingEngine(this).render("rel/ListagemVendas.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new ListagemVendas();
  }
}
