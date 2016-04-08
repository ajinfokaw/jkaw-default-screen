package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class Setor {
  public Setor() throws Exception {
    new SwingEngine(this).render("swix/Setor.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new Setor();
  }
}
