package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class LookupProdutosParameters {
  public LookupProdutosParameters() throws Exception {
    new SwingEngine(this).render("swix/LookupProdutosParameters.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new LookupProdutosParameters();
  }
}
