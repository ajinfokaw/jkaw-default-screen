package rel;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class ListagemPagar {
  public ListagemPagar() throws Exception {
    new SwingEngine(this).render("rel/ListagemPagar.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new ListagemPagar();
  }
}
