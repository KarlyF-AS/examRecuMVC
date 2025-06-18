public class Controller {
    public static void iniciarAplicacion() {
        cargarDatosDePrueba();
        View.main();
    }

    private static void cargarDatosDePrueba() {
        Model.sumarNumeros(5.0, 2.0);
        Model.restarNumeros(5.0, 3.0);
        Model.multiplicarNumeros(2.5, 3.0);
        Model.dividirNumeros(6.0, 8.0);
    }
}