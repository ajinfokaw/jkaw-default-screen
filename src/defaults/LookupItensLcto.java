package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class LookupItensLcto {
  public LookupItensLcto() throws Exception {
    new SwingEngine(this).render("defaults/LookupItensLcto.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new LookupItensLcto();
  }
}
