package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class LancamentoOS {
  public LancamentoOS() throws Exception {
    new SwingEngine(this).render("swix/LancamentoOS.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new LancamentoOS();
  }
}
