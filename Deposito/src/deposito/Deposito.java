
package deposito;

public class Deposito {
private Persona titular;
private double capital;
private int plazoDias;
private double tipoInteres;
public Deposito(Persona titular, double capital,
int plazoDias, double tipoInteres) {
this.titular = titular;
this.capital = capital;
this.plazoDias = plazoDias;
this.tipoInteres = tipoInteres;
}

public double liquidar() {
return getCapital() + getIntereses();
}
public double getIntereses() {
return (plazoDias * tipoInteres * capital)/365;
}

}
