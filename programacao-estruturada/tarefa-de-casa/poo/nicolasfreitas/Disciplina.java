public class Disciplina {
    private Integer id;
    private String nome;
    private String descricao;

    public Disciplina() {
    }

    public Disciplina(Integer id, String nome, String descricao) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
    }

    public Integer getID() {
        return this.id;
    }

    public void setID(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return ("\nID: " + getID() + "\nDisciplina: " + getNome()
                + "\nDescrição: " + getDescricao());
    }
}
