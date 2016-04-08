package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class CondPg {
  public CondPg() throws Exception {
    new SwingEngine(this).render("swix/CondPg.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new CondPg();
  }
}
