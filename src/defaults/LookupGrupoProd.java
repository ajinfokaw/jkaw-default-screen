package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class LookupGrupoProd {
  public LookupGrupoProd() throws Exception {
    new SwingEngine(this).render("swix/LookupGrupoProd.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new LookupGrupoProd();
  }
}
