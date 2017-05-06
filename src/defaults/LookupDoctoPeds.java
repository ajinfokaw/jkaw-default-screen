package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class LookupDoctoPeds {
  public LookupDoctoPeds() throws Exception {
    new SwingEngine(this).render("defaults/LookupDoctoPeds.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new LookupDoctoPeds();
  }
}
