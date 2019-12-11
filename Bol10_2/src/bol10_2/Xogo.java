/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol10_2;
import javax.swing.JOptionPane;
/**
 *
 * @author io
 */
public class Xogo {
     private int num;
    private int intentos;

    public Xogo() {

    }

    public Xogo(int n, int intentos) {
        num = n;
        this.intentos = intentos;

    }

    public void Xogar() {
        num = (int)(Math.random() * (50-1)+1);
        intentos = Integer.parseInt(JOptionPane.showInputDialog("Teclee nº intentos: "));
        int resposta;
        do {
            resposta = Integer.parseInt(JOptionPane.showInputDialog("Teclee resposta: "));
            int diferenza = Math.abs(resposta - num);
            if (diferenza > 20) {
                JOptionPane.showMessageDialog(null, "Moi lonxe", "Pista", JOptionPane.WARNING_MESSAGE);
            } else if (diferenza > 10) {
                JOptionPane.showMessageDialog(null, "Lonxe", "Pista", JOptionPane.WARNING_MESSAGE);
            } else if (diferenza > 5) {
                JOptionPane.showMessageDialog(null, "Preto", "Pista", JOptionPane.WARNING_MESSAGE);
            } else if (diferenza > 0) {
                JOptionPane.showMessageDialog(null, "Moi preto", "Pista", JOptionPane.WARNING_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Ganaches!", "PARABÉNS", JOptionPane.INFORMATION_MESSAGE);
            }
            intentos--;

        } while (intentos > 0 && resposta != num);
        JOptionPane.showMessageDialog(null, "Final do xogo");

    }

}   

