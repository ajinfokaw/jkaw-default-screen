package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class Setor2 {
  public Setor2() throws Exception {
    new SwingEngine(this).render("swix/Setor2.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new Setor2();
  }
}
