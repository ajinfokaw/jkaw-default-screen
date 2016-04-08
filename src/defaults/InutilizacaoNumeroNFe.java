package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class InutilizacaoNumeroNFe {
  public InutilizacaoNumeroNFe() throws Exception {
    new SwingEngine(this).render("swix/InutilizacaoNumeroNFe.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new InutilizacaoNumeroNFe();
  }
}
