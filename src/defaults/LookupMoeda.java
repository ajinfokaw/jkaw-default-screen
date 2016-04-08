package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class LookupMoeda {
  public LookupMoeda() throws Exception {
    new SwingEngine(this).render("swix/LookupMoeda.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new LookupMoeda();
  }
}
