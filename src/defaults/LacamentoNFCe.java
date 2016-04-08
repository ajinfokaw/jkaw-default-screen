package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class LacamentoNFCe {
  public LacamentoNFCe() throws Exception {
    new SwingEngine(this).render("defaults/LacamentoNFCe.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new LacamentoNFCe();
  }
}
