package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class LookupClassTrib {
  public LookupClassTrib() throws Exception {
    new SwingEngine(this).render("swix/LookupClassTrib.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new LookupClassTrib();
  }
}
