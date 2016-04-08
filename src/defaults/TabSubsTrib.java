package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class TabSubsTrib {
  public TabSubsTrib() throws Exception {
    new SwingEngine(this).render("swix/TabSubsTrib.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new TabSubsTrib();
  }
}
