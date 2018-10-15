package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class Diretiva2 {
  public Diretiva2() throws Exception {
    new SwingEngine(this).render("defaults/Diretiva2.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new Diretiva2();
  }
}
