package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class Filial {
  public Filial() throws Exception {
    new SwingEngine(this).render("swix/Filial.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new Filial();
  }
}
