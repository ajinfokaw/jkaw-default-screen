package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class LookupLisPre {
  public LookupLisPre() throws Exception {
    new SwingEngine(this).render("swix/LookupLisPre.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new LookupLisPre();
  }
}
