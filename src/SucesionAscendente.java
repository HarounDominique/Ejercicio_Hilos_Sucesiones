public class SucesionAscendente extends Thread {
    int inicio;
    int fin;
    String nombre;

    public SucesionAscendente(int inicio, int fin, String nombre) {
        super(nombre);
        this.inicio = inicio;
        this.fin = fin;
        this.nombre = nombre;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " se ha iniciado.");
        for (int i = inicio; i < fin; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
        System.out.println(Thread.currentThread().getName() + " ha finalizado.");
    }

    public static void main(String[] args) {
        SucesionAscendente h1 = new SucesionAscendente(5, 15, "HiloA");
        SucesionAscendente h2 = new SucesionAscendente(7, 20, "HiloB");

        h1.start();
        h2.start();
    }
}
