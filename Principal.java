public class Principal {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Alice", 30);
        Pessoa pessoa2 = new Pessoa("Carol", 12);
        Pessoa pessoa3 = new Pessoa("Maria", 18);

        Desenho desenho = new Desenho("Retrato");
        Lapis lapis = new Lapis("Roxo");
        Borracha borracha = new Borracha("Platisco");

        pessoa1.detalhes();
        pessoa2.detalhes();
        pessoa3.detalhes();

        desenho.detalhes();
        lapis.detalhes();
        borracha.detalhes();
    }
}
