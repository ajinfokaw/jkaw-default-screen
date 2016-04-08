package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class Classificacao_G {
  public Classificacao_G() throws Exception {
    new SwingEngine(this).render("swix/Classificacao_G.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new Classificacao_G();
  }
}
