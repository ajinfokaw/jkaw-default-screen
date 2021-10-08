package rel;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class ListagemClassABC {
  public ListagemClassABC() throws Exception {
    new SwingEngine(this).render("rel/ListagemClassABC.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new ListagemClassABC();
  }
}
