package br.com.jad.api.request;

import br.com.jad.api.model.UsuarioModel;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

public class UsuarioRequest {

    @NotBlank
    private String nome;

    @Min(18)
    @Max(28)
    private Integer idade;

    @NotBlank
    private String sexo;

    @CPF
    private String cpf;

    @Deprecated
    public UsuarioRequest() {
    }

    public UsuarioRequest(String nome, Integer idade, String sexo, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.cpf = cpf;
    }

    public UsuarioModel toModel() {
        return new UsuarioModel(this.nome, this.idade, this.sexo, this.cpf);
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
