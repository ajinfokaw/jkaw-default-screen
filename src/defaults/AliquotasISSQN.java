package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class AliquotasISSQN {
  public AliquotasISSQN() throws Exception {
    new SwingEngine(this).render("swix/AliquotasISSQN.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new AliquotasISSQN();
  }
}
