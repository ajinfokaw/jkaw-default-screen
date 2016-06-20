package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class Parameters2 {
  public Parameters2() throws Exception {
    new SwingEngine(this).render("defaults/Parameters2.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new Parameters2();
  }
}
