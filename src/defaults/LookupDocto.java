package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class LookupDocto {
  public LookupDocto() throws Exception {
    new SwingEngine(this).render("defaults/LookupDocto.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new LookupDocto();
  }
}
