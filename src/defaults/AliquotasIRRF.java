package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class AliquotasIRRF {
  public AliquotasIRRF() throws Exception {
    new SwingEngine(this).render("swix/AliquotasIRRF.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new AliquotasIRRF();
  }
}
