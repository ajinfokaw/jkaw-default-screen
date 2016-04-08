package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class LookupClassificacaoReg {
  public LookupClassificacaoReg() throws Exception {
    new SwingEngine(this).render("swix/LookupClassificacaoReg.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new LookupClassificacaoReg();
  }
}
