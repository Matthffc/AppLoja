package br.com.SistemaLoja.model.Pessoa;

import br.com.SistemaLoja.model.Pessoa.Pessoa;

class Cliente extends Pessoa {
    private String endereco;
    private String telefone;

    public Cliente(String nome, String cpf, String endereco, String telefone) {
        super(nome, cpf);
        this.endereco = endereco;
        this.telefone = telefone;
    }

    // Getters e setters específicos do Cliente

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
