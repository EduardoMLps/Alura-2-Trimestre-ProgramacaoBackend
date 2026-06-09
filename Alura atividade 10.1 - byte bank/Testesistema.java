public class Testesistema {
    public static void main(String[] args) {
        Gerente g1 = new Gerente();
        Administrador a1 = new Administrador();

        g1.setSenha(2222);
        a1.setSenha(2222);

        SistemaInterno s1 = new SistemaInterno();
        s1.autentica(g1);
        s1.autentica(a1);
    }
}
