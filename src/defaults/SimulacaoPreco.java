package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class SimulacaoPreco {
  public SimulacaoPreco() throws Exception {
    new SwingEngine(this).render("swix/SimulacaoPreco.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new SimulacaoPreco();
  }
}
