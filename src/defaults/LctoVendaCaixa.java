package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class LctoVendaCaixa {
  public LctoVendaCaixa() throws Exception {
    new SwingEngine(this).render("defaults/LctoVendaCaixa.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new LctoVendaCaixa();
  }
}
