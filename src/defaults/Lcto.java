package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class Lcto {
  public Lcto() throws Exception {
    new SwingEngine(this).render("defaults/Lcto.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new Lcto();
  }
}
