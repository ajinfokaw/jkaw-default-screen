package main;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class FormFrame {
  public FormFrame() throws Exception {
    new SwingEngine(this).render("main/FormFrame.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new FormFrame();
  }
}
