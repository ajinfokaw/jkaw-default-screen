package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class LookupAliqIRRF {
  public LookupAliqIRRF() throws Exception {
    new SwingEngine(this).render("swix/LookupAliqIRRF.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new LookupAliqIRRF();
  }
}
