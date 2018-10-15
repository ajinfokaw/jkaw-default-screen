package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class LctoOS {
  public LctoOS() throws Exception {
    new SwingEngine(this).render("defaults/LctoOS.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new LctoOS();
  }
}
