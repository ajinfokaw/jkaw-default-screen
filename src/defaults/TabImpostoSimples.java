package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class TabImpostoSimples {
  public TabImpostoSimples() throws Exception {
    new SwingEngine(this).render("swix/TabImpostoSimples.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new TabImpostoSimples();
  }
}
