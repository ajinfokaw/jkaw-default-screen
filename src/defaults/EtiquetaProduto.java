package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class EtiquetaProduto {
  public EtiquetaProduto() throws Exception {
    new SwingEngine(this).render("swix/EtiquetaProduto.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new EtiquetaProduto();
  }
}
