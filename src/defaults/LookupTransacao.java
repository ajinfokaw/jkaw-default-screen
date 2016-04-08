package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class LookupTransacao {
  public LookupTransacao() throws Exception {
    new SwingEngine(this).render("swix/LookupTransacao.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new LookupTransacao();
  }
}
