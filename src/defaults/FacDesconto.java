package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class FacDesconto {
  public FacDesconto() throws Exception {
    new SwingEngine(this).render("defaults/FacDesconto.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new FacDesconto();
  }
}
