package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class ConfigImpCadGru {
  public ConfigImpCadGru() throws Exception {
    new SwingEngine(this).render("swix/ConfigImpCadGru.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new ConfigImpCadGru();
  }
}
