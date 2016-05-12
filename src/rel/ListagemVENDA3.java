package rel;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class ListagemVENDA3 {
  public ListagemVENDA3() throws Exception {
    new SwingEngine(this).render("rel/ListagemVENDA3.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new ListagemVENDA3();
  }
}
