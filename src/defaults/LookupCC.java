package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class LookupCC {
  public LookupCC() throws Exception {
    new SwingEngine(this).render("swix/LookupCC.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new LookupCC();
  }
}
