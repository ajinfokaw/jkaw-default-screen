package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class LancamentoNFCe {
  public LancamentoNFCe() throws Exception {
    new SwingEngine(this).render("defaults/LancamentoNFCe.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new LancamentoNFCe();
  }
}
