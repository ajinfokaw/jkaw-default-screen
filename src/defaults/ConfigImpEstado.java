package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class ConfigImpEstado {
  public ConfigImpEstado() throws Exception {
    new SwingEngine(this).render("swix/ConfigImpEstado.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new ConfigImpEstado();
  }
}
