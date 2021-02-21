package universidadean.impuestoscarro.mundo;

public class main {

    public static void main(String[] args) throws Exception{
        CalculadorImpuestos prueba = new CalculadorImpuestos();
        System.out.println(prueba.calcularPago(true, true, false));
    }

}
