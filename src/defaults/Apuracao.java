package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class Apuracao {
  public Apuracao() throws Exception {
    new SwingEngine(this).render("swix/Apuracao.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new Apuracao();
  }
}
