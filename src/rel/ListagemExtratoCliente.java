package rel;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class ListagemExtratoCliente {
  public ListagemExtratoCliente() throws Exception {
    new SwingEngine(this).render("rel/ListagemExtratoCliente.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new ListagemExtratoCliente();
  }
}
