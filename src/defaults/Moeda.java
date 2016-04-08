package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class Moeda {
  public Moeda() throws Exception {
    new SwingEngine(this).render("swix/Moeda.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new Moeda();
  }
}
