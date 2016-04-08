package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class LancamentoGNfe {
  public LancamentoGNfe() throws Exception {
    new SwingEngine(this).render("defaults/LancamentoGNfe.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new LancamentoGNfe();
  }
}
