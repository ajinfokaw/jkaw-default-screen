package rel;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class ListagemRomaneio {
  public ListagemRomaneio() throws Exception {
    new SwingEngine(this).render("rel/ListagemRomaneio.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new ListagemRomaneio();
  }
}
