//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Usuario u1 = new Usuario("pedro143", "pedro143@gmail.com");
    Usuario u2 = new Usuario("m4ri4", "m4ri4@gmail.com");
    Usuario u3 = new Usuario("perez546", "peres546@gmail.com");
    Usuario u4 = new Usuario("hector657", "hector657@gmail.com");

    u1.mostrarInformacion();
    u2.mostrarInformacion();
    u3.mostrarInformacion();
    u4.mostrarInformacion();

    System.out.println("\nTotal de usuarios: " + Usuario.getContadorUsuarios());
}
