package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class Lancamento {
  public Lancamento() throws Exception {
    new SwingEngine(this).render("swix/Lancamento.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new Lancamento();
  }
}
