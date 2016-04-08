package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class Pais {
  public Pais() throws Exception {
    new SwingEngine(this).render("swix/Pais.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new Pais();
  }
}
