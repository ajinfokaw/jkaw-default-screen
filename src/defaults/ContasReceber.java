package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class ContasReceber {
  public ContasReceber() throws Exception {
    new SwingEngine(this).render("swix/ContasReceber.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new ContasReceber();
  }
}
