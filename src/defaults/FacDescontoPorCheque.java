package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class FacDescontoPorCheque {
  public FacDescontoPorCheque() throws Exception {
    new SwingEngine(this).render("defaults/FacDescontoPorCheque.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new FacDescontoPorCheque();
  }
}
