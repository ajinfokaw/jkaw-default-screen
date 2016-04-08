package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class Parameters {
  public Parameters() throws Exception {
    new SwingEngine(this).render("defaults/Parameters.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new Parameters();
  }
}
