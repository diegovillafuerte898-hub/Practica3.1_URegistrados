public class Usuario {
    private int id;
    private String username;
    private String correo;
    private boolean activo;
    private static int contadorUsuarios = 0;

    public Usuario(String username, String correo) {
        contadorUsuarios++;
        this.id = contadorUsuarios;
        this.username = username;
        this.correo = correo;
        this.activo = true;
    }

    public static int getContadorUsuarios() {
        return contadorUsuarios;
    }

    public void mostrarInformacion() {
        System.out.println("\nID: " + id);
        System.out.println("Username: " + username);
        System.out.println("Correo: " + correo);
        System.out.println("Activo: " + activo);
    }
}
