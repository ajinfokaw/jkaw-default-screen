package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class LookupAliqISSQN {
  public LookupAliqISSQN() throws Exception {
    new SwingEngine(this).render("swix/LookupAliqISSQN.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new LookupAliqISSQN();
  }
}
