package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class RegraTbC {
  public RegraTbC() throws Exception {
    new SwingEngine(this).render("swix/RegraTbC.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new RegraTbC();
  }
}
