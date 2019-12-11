package bol10_1;

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

    public Xogo(int n, int intentos, String pista1, String pista2) {
        num = n;
        this.intentos = intentos;

    }

    public void Xogar() {
        num = Integer.parseInt(JOptionPane.showInputDialog("Teclee un número entre 1 e 50: "));
        intentos = Integer.parseInt(JOptionPane.showInputDialog("Teclee nº intentos: "));
        int resposta;
        do {
            resposta = Integer.parseInt(JOptionPane.showInputDialog("Teclee resposta: "));
            if (resposta != num) {
                intentos--;
                if (resposta < num) {
                    JOptionPane.showMessageDialog(null, "O número é maior", "Pista", JOptionPane.WARNING_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "O número é menor", "Pista", JOptionPane.WARNING_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Esa foi a resposta correcta", "PARABÉNS", JOptionPane.INFORMATION_MESSAGE);
            }

        } while (intentos > 0 && resposta != num);
        JOptionPane.showMessageDialog(null, "Final do xogo");

    }

}