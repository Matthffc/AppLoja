package br.com.SistemaLoja.model.Pessoa;

import br.com.SistemaLoja.model.Pessoa.Pessoa;

class Adm extends Pessoa {

    private String loginAdmin;

    private String senhaAdmin;

    public Adm(String nome, String cpf, String cargo, String loginAdmin, String senhaAdmin) {
        super(nome, cpf);
        this.loginAdmin = loginAdmin;
        this.senhaAdmin = senhaAdmin;
    }

    // Getters e setters específicos do Funcionario


    public String getLoginAdmin() {
        return loginAdmin;
    }

    public void setLoginAdmin(String loginAdmin) {
        this.loginAdmin = loginAdmin;
    }

    public String getSenhaAdmin() {
        return senhaAdmin;
    }

    public void setSenhaAdmin(String senhaAdmin) {
        this.senhaAdmin = senhaAdmin;
    }

}