package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class Transacao {
  public Transacao() throws Exception {
    new SwingEngine(this).render("swix/Transacao.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new Transacao();
  }
}
