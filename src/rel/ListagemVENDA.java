package rel;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class ListagemVENDA {
  public ListagemVENDA() throws Exception {
    new SwingEngine(this).render("rel/ListagemVENDA.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new ListagemVENDA();
  }
}
