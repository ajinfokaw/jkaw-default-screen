package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class Romaneio {
  public Romaneio() throws Exception {
    new SwingEngine(this).render("defaults/Romaneio.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new Romaneio();
  }
}
