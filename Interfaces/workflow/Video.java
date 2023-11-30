public class Video {
    private String arquivo;
    private FormatoVideo formato;

    public Video(String arquivo, FormatoVideo formato) {
        this.arquivo = arquivo;
        this.formato = formato;
    }

    public String getArquivo() {
        return this.arquivo;
    }

    public void setArquivo(String arquivo) {
        this.arquivo = arquivo;
    }

    public FormatoVideo getFormato() {
        return this.formato;
    }

    public void setFormato(FormatoVideo formato) {
        this.formato = formato;
    }
}