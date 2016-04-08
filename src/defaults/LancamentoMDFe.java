package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class LancamentoMDFe {
  public LancamentoMDFe() throws Exception {
    new SwingEngine(this).render("defaults/LancamentoMDFe.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new LancamentoMDFe();
  }
}
