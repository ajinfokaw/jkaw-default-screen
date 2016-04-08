package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class LookupTabelaPreco {
  public LookupTabelaPreco() throws Exception {
    new SwingEngine(this).render("swix/LookupTabelaPreco.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new LookupTabelaPreco();
  }
}
