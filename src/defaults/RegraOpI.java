package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class RegraOpI {
  public RegraOpI() throws Exception {
    new SwingEngine(this).render("defaults/RegraOpI.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new RegraOpI();
  }
}
