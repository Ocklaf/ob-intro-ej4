// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Cliente newCustomer = new Cliente();
        newCustomer.setCredito(12200);
        newCustomer.setEdad(39);
        newCustomer.setTelefono("685959113");
        newCustomer.setNombre("José Vicente Falcó");

        System.out.println(newCustomer.getNombre());
        System.out.println(newCustomer.getEdad());
        System.out.println(newCustomer.getTelefono());
        System.out.println(newCustomer.getCredito() + "\n");


        Trabajador newWorker = new Trabajador();
        newWorker.setEdad(39);
        newWorker.setTelefono("685959113");
        newWorker.setNombre("José Vicente Falcó");
        newWorker.setSalario(999999);

        System.out.println(newWorker.getNombre());
        System.out.println(newWorker.getEdad());
        System.out.println(newWorker.getTelefono());
        System.out.println(newWorker.getSalario());
    }
}

