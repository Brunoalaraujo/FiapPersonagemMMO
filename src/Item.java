public class Item {
    String nome;
    String descricao;
    Boolean raro;
    int nivelPoder;

    public Item(String nome, String descricao, Boolean raro, int nivelPoder) {
        this.nome = nome;
        this.descricao = descricao;
        this.raro = raro;
        this.nivelPoder = nivelPoder;
    }

    public Item() {
    }
}
