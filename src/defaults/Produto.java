package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class Produto {
  public Produto() throws Exception {
    new SwingEngine(this).render("swix/Produto.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new Produto();
  }
}
