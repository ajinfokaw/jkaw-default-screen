package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class Classificacao_Reg {
  public Classificacao_Reg() throws Exception {
    new SwingEngine(this).render("swix/Classificacao_Reg.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new Classificacao_Reg();
  }
}
