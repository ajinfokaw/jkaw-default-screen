package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class LookupVeiculosProprietario {
  public LookupVeiculosProprietario() throws Exception {
    new SwingEngine(this).render("swix/LookupVeiculosProprietario.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new LookupVeiculosProprietario();
  }
}
