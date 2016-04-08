package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class LancamentoGMDFe {
  public LancamentoGMDFe() throws Exception {
    new SwingEngine(this).render("defaults/LancamentoGMDFe.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new LancamentoGMDFe();
  }
}
