package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class LookupClassificacaoG {
  public LookupClassificacaoG() throws Exception {
    new SwingEngine(this).render("swix/LookupClassificacaoG.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new LookupClassificacaoG();
  }
}
