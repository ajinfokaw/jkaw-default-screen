package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class Serie {
  public Serie() throws Exception {
    new SwingEngine(this).render("swix/Serie.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new Serie();
  }
}
