package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class Irregularidade {
  public Irregularidade() throws Exception {
    new SwingEngine(this).render("swix/Irregularidade.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new Irregularidade();
  }
}
