package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class LookupSerie {
  public LookupSerie() throws Exception {
    new SwingEngine(this).render("swix/LookupSerie.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new LookupSerie();
  }
}
