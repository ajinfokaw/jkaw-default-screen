package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class FacSimulacao {
  public FacSimulacao() throws Exception {
    new SwingEngine(this).render("swix/FacSimulacao.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new FacSimulacao();
  }
}
