package m05_orientacaoaobjeto.tarefaDeCasa.enums;

public enum StatusEnum {

    //ATIVO, INATIVO, CANCELADO, SUSPENSO
    ATIVO(1l,"ativo"), 
    INATIVO(2l,"inativo"), 
    CANCELADO(3l,"cancelado"),
    SUSPENSO(4l, "suspenso");

    Long id;
    String descricao;

    StatusEnum(Long id, String descricao){
        this.id = id;
        this.descricao = descricao;
    }

    public String getDescricao(){
        return descricao;
    }

    public Long getId(){
        return id;
    }
}
