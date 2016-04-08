package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class Solicitacao {
  public Solicitacao() throws Exception {
    new SwingEngine(this).render("defaults/Solicitacao.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new Solicitacao();
  }
}
