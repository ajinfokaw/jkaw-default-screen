package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class RegraOpC {
  public RegraOpC() throws Exception {
    new SwingEngine(this).render("swix/RegraOpC.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new RegraOpC();
  }
}
