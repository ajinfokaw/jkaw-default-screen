package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class RegraOpT {
  public RegraOpT() throws Exception {
    new SwingEngine(this).render("swix/RegraOpT.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new RegraOpT();
  }
}
