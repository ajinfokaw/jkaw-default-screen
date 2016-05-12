package rel;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class ConfiguraBD {
  public ConfiguraBD() throws Exception {
    new SwingEngine(this).render("rel/ConfiguraBD.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new ConfiguraBD();
  }
}
