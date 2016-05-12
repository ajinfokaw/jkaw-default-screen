package rel;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class ListagemVENDA2 {
  public ListagemVENDA2() throws Exception {
    new SwingEngine(this).render("rel/ListagemVENDA2.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new ListagemVENDA2();
  }
}
