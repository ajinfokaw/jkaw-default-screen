package rel;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class BalancoDeResultado {
  public BalancoDeResultado() throws Exception {
    new SwingEngine(this).render("rel/BalancoDeResultado.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new BalancoDeResultado();
  }
}
