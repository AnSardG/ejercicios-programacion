
import java.util.GregorianCalendar;

/**
 *
 * @author Antonio Sard González
 */
public class CuentaAhorro extends Cuenta {
    //Atributos:

    private double cuotaMantenimiento;

    //Constructores:
    public CuentaAhorro() {
    }

    public CuentaAhorro(String nombre, String CCC, double saldo, double tipoDeInteres,
            double cuotaMantenimiento) {
        super(nombre, CCC, saldo, tipoDeInteres);
        this.cuotaMantenimiento = cuotaMantenimiento;
    }

    //Métodos:
    /**
     * @return the cuotaMantenimiento
     */
    public double getCuotaMantenimiento() {
        return cuotaMantenimiento;
    }

    /**
     * @param cuotaMantenimiento the cuotaMantenimiento to set
     */
    public void setCuotaMantenimiento(double cuotaMantenimiento) {
        this.cuotaMantenimiento = cuotaMantenimiento;
    }

    @Override
    public void comisiones() {
        //Entorno:
        GregorianCalendar date;
        //Algoritmo:
        date = new GregorianCalendar();
        if (date.get(GregorianCalendar.DAY_OF_MONTH) == 1) {
            reintegro(cuotaMantenimiento);
        }
    }

    @Override
    public double intereses() {
        //Entorno:
        GregorianCalendar date;
        //Algoritmo:
        date = new GregorianCalendar();
        if (date.get(GregorianCalendar.DAY_OF_MONTH) == 1) {
            setTiempo(getTiempo() + 1);          
        }
        return (estado() + getTipoDeInteres() + getTiempo()) / 1200;
    }
}
