package pack.ejercicios;

public class CuentaBancaria {
    String titularCuenta;
    String tipoDeCuenta;
    int numeroCuenta;
    double saldoCuenta;

    public CuentaBancaria(String titularCuenta, String tipoDeCuenta, int numeroCuenta) {
        this.titularCuenta = titularCuenta;
        this.tipoDeCuenta = tipoDeCuenta;
        this.numeroCuenta = numeroCuenta;
        this.saldoCuenta = 0.0;
    }

    public double consultarSaldo() {
        return saldoCuenta;
    }
    public void depositar(double monto) {
        this.saldoCuenta = this.saldoCuenta + monto;
    }
    public void girar(double monto) {
        this.saldoCuenta = this.saldoCuenta - monto;
    }
}
//se dejaron fuera los datos de fecha de apertura, contraseña o surcursal al no ser de caracter basico