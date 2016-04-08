package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class ConfigImpDoctoI {
  public ConfigImpDoctoI() throws Exception {
    new SwingEngine(this).render("swix/ConfigImpDoctoI.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new ConfigImpDoctoI();
  }
}
