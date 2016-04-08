package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class Marcas {
  public Marcas() throws Exception {
    new SwingEngine(this).render("swix/Marcas.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new Marcas();
  }
}
