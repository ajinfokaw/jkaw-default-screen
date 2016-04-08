package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class Simulacao {
  public Simulacao() throws Exception {
    new SwingEngine(this).render("swix/Simulacao.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new Simulacao();
  }
}
