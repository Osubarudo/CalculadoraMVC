package modelo;
/**
 *
 * @author osval
 */
public class Calculadora {

    private int numeroUno;
    private int numeroDos;
    private int resultado;

    public Calculadora() {
    }
    
    public int sumar() {
        this.resultado = this.numeroUno + this.numeroDos;
        return this.resultado;
    }

    public int restar() {
        this.resultado = this.numeroUno - this.numeroDos;
        return this.resultado;
    }

    public int multiplicar() {
        this.resultado = this.numeroUno * this.numeroDos;
        return this.resultado;
    }

    public int dividir() {
        try {
            this.resultado = this.numeroUno / this.numeroDos;

        } catch (ArithmeticException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return this.resultado;
    }

    public int getNumeroUno() {
        return numeroUno;
    }

    public void setNumeroUno(int numeroUno) {
        this.numeroUno = numeroUno;
    }

    public int getNumeroDos() {
        return numeroDos;
    }

    public void setNumeroDos(int numeroDos) {
        this.numeroDos = numeroDos;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }
    
    

}
