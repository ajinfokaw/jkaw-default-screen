package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class Estado {
  public Estado() throws Exception {
    new SwingEngine(this).render("swix/Estado.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new Estado();
  }
}
