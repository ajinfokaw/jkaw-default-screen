package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class ReciboAvulso {
  public ReciboAvulso() throws Exception {
    new SwingEngine(this).render("swix/ReciboAvulso.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new ReciboAvulso();
  }
}
