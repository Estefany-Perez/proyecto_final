
package proyecto_java_final;

import java.util.Scanner;
/**
 *
 * @author Estefany
 */
public class Formatofecha {
    private String fechaSinFormato;

    public String getFechaSinFormato() {
        return fechaSinFormato;
    }

    public void setFechaSinFormato(String fecha) {
        this.fechaSinFormato = fecha;
    }

    public void ImprimirGuiones() {
        String cadena=fechaSinFormato.substring(0,2)+"-";
        cadena=cadena+fechaSinFormato.substring(2,4)+"-";
        cadena=cadena+fechaSinFormato.substring(4,8);
        System.out.println("\nFecha con guiones:\n"+cadena);
    }

    public void ImprimitFlecas() {
        String cadena=fechaSinFormato.substring(0,2)+"/";
        cadena=cadena+fechaSinFormato.substring(2,4)+"/";
        cadena=cadena+fechaSinFormato.substring(4,8);
        System.out.println("\nFecha con flecas:\n"+cadena);
    }
    public static void main(String[] args) {
        Scanner inf=new Scanner(System.in);
        Formatofecha f=new Formatofecha();
        System.out.println("Ingrese una fecha sin formato ejemplo 12102020 = dia/mes/año");
        String fecha=inf.nextLine();
        
        f.setFechaSinFormato(fecha);
        f.ImprimirGuiones();
        f.ImprimitFlecas();
    }
}

