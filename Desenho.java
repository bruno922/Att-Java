public class Desenho {
    String tipo;

    public Desenho(String tipoDesenho) {
    tipo = tipoDesenho;
    }

    public void detalhes(){
        System.out.println("Tipo de Desenho: " + tipo);
    }
}

