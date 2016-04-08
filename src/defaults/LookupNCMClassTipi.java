package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class LookupNCMClassTipi {
  public LookupNCMClassTipi() throws Exception {
    new SwingEngine(this).render("swix/LookupNCMClassTipi.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new LookupNCMClassTipi();
  }
}
