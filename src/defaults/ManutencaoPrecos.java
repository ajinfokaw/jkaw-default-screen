package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class ManutencaoPrecos {
  public ManutencaoPrecos() throws Exception {
    new SwingEngine(this).render("defaults/ManutencaoPrecos.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new ManutencaoPrecos();
  }
}
