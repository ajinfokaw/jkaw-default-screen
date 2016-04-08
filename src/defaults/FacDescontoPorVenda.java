package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class FacDescontoPorVenda {
  public FacDescontoPorVenda() throws Exception {
    new SwingEngine(this).render("defaults/FacDescontoPorVenda.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new FacDescontoPorVenda();
  }
}
