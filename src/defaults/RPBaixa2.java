package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class RPBaixa2 {
  public RPBaixa2() throws Exception {
    new SwingEngine(this).render("swix/RPBaixa2.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new RPBaixa2();
  }
}
