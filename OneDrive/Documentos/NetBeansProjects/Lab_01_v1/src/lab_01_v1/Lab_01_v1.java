/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab_01_v1;

import javax.swing.JOptionPane;

/**
 *
 * @author santa
 */
public class Lab_01_v1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Declaracion de variables
        String nombre[];
        String nacionalidad[];
        double tiempo[];
        int totalAtletas;
        double may = 0;
        double min = 999999999;
        String nombreMin = null;
        String nacionalidadMin = null;
        String nombreAtletaPais;
        double sumTiempo = 0;
        double tiempoPromedio;
        String nacionalidadPais;
//Menu
        JOptionPane.showMessageDialog(null, "Competencia\n" + "1.Registrar Atleta\n" + "2.Datos del campeón\n"
                + "3.Atletas por país\n" + "4.Tiempo promedio de todos los atletas\n" + "5.Salir");
        totalAtletas = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de atletas"));
        nombre = new String[totalAtletas];
        nacionalidad = new String[totalAtletas];
        tiempo = new double[totalAtletas];
//Registrar Atletas
        JOptionPane.showMessageDialog(null, "1.Registrar Atleta");
        for (int i = 0; i < totalAtletas; i++) {
            nombre[i] = JOptionPane.showInputDialog(null, "Ingrese el nombre del atleta: ");
            nacionalidad[i] = JOptionPane.showInputDialog(null, "Ingrese la nacionalidad del atleta: ");
            tiempo[i] = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el tiempo en minutos de"
                    + "atleta: "));
            sumTiempo += tiempo[i];
        }
//Datos Campeon
        JOptionPane.showMessageDialog(null, "2.Datos del campeón");
        for (int i = 0; i < totalAtletas; i++) {
            if (tiempo[i] > may) {
                may = tiempo[i];
            }
            if (tiempo[i] < min) {
                min = tiempo[i];
                nombreMin = nombre[i];
                nacionalidadMin = nacionalidad[i];
            }
        }
        System.out.println(may);
        System.out.println(min + nombreMin);
        JOptionPane.showMessageDialog(null, "Nombre del atleta campeon es: " + nombreMin + " de nacionalidad "
                + nacionalidadMin + " cuyo tiempo fue: " + min);
//Guardar Atletas por pais
        JOptionPane.showMessageDialog(null, "3.Atletas por pais");
        nacionalidadPais = JOptionPane.showInputDialog(null, "Ingrese la nacionalidad para mostrar "
                + "los atletas de ese pais: ");
        for (int i = 0; i < totalAtletas; i++) {
            nacionalidad[i] = nacionalidadPais;
            nombreAtletaPais = nombre[i];
            JOptionPane.showMessageDialog(null, "El nombre de un atleta de nacionalidad " + nacionalidadPais
                    + " es: " + nombreAtletaPais);
        }
//Promedio de tiempos
        JOptionPane.showMessageDialog(null, "4. Tiempo promedio de todos los atletas");
        tiempoPromedio = sumTiempo / totalAtletas;
        JOptionPane.showMessageDialog(null, "El tiempo promedio de los atletas fue: " + tiempoPromedio);
//salir
        JOptionPane.showMessageDialog(null, "5.Salir");
    }
}
