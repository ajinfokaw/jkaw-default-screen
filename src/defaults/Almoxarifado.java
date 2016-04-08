package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class Almoxarifado {
  public Almoxarifado() throws Exception {
    new SwingEngine(this).render("swix/Almoxarifado.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new Almoxarifado();
  }
}
