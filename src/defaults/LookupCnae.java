package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class LookupCnae {
  public LookupCnae() throws Exception {
    new SwingEngine(this).render("swix/LookupCnae.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new LookupCnae();
  }
}
