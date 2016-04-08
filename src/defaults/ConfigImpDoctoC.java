package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class ConfigImpDoctoC {
  public ConfigImpDoctoC() throws Exception {
    new SwingEngine(this).render("swix/ConfigImpDoctoC.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new ConfigImpDoctoC();
  }
}
