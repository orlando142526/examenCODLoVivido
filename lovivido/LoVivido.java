package lovivido;

import javax.swing.JOptionPane;

public class LoVivido {

    public static void main(String[] args) {
        String nombre;
        String edad;

        int meses;
        int dias;
        int horas;
        int a;

        nombre = JOptionPane.showInputDialog("Escriba su nombre: ");
        edad = JOptionPane.showInputDialog("Escriba su edad: ");

        a = Integer.parseInt(edad);

        meses = (a * 12);
        dias = (a * 365);
        horas = (dias * 24);

        JOptionPane.showMessageDialog(null, "Meses: " + meses, "Numero de meses vividos de " + nombre, JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showMessageDialog(null, "Días: " + dias, "Numero de días vividos de " + nombre, JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showMessageDialog(null, "Horas: " + horas, "Numero de horas vividos de " + nombre, JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
// en refactor puse rename para cambiar a nombres donde a n=nombre, e=edad, m=meses, d=dias, h=horas .
    }

}
