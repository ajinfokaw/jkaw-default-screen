package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class FormaPagamento {
  public FormaPagamento() throws Exception {
    new SwingEngine(this).render("swix/FormaPagamento.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new FormaPagamento();
  }
}
