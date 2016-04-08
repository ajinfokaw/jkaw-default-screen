package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class ContasPagar {
  public ContasPagar() throws Exception {
    new SwingEngine(this).render("swix/ContasPagar.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new ContasPagar();
  }
}
