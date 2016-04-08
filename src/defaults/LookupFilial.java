package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class LookupFilial {
  public LookupFilial() throws Exception {
    new SwingEngine(this).render("swix/LookupFilial.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new LookupFilial();
  }
}
