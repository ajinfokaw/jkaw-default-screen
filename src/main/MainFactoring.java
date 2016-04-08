package main;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class MainFactoring {
  public MainFactoring() throws Exception {
    new SwingEngine(this).render("main/MainFactoring.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new MainFactoring();
  }
}
