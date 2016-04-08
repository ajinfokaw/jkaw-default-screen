package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class LookupCondPgTabela {
  public LookupCondPgTabela() throws Exception {
    new SwingEngine(this).render("swix/LookupCondPgTabela.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new LookupCondPgTabela();
  }
}
