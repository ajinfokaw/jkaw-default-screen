package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class Modelo {
  public Modelo() throws Exception {
    new SwingEngine(this).render("swix/Modelo.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new Modelo();
  }
}
