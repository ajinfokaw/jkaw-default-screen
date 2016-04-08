package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class Cotacao {
  public Cotacao() throws Exception {
    new SwingEngine(this).render("swix/Cotacao.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new Cotacao();
  }
}
