package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class FacDescontoPorDuplicata {
  public FacDescontoPorDuplicata() throws Exception {
    new SwingEngine(this).render("defaults/FacDescontoPorDuplicata.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new FacDescontoPorDuplicata();
  }
}
