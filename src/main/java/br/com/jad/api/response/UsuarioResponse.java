package br.com.jad.api.response;


import br.com.jad.api.model.UsuarioModel;

public class UsuarioResponse {

    private String nome;
    private Integer idade;
    private String sexo;

    @Deprecated
    public UsuarioResponse() {
    }

    public UsuarioResponse(UsuarioModel usuarioModel) {
        this.nome = usuarioModel.getNome();
        this.idade = usuarioModel.getIdade();
        this.sexo = usuarioModel.getSexo();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}
