package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class LookupCondPg {
  public LookupCondPg() throws Exception {
    new SwingEngine(this).render("swix/LookupCondPg.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new LookupCondPg();
  }
}
