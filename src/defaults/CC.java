package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class CC {
  public CC() throws Exception {
    new SwingEngine(this).render("swix/CC.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new CC();
  }
}
