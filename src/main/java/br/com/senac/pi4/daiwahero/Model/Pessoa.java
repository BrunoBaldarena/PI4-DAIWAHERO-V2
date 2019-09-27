package br.com.senac.pi4.daiwahero.Model;
/**
 *
 * @author Deyvid
 */
public class Pessoa {
    
    private int id;
    private String nome;
    private String genero;
    private String email;
    private String senha;
    private String cpf;
    private int telefone;
    
    public Pessoa(){       
    }

    public Pessoa(int id, String nome, String genero, String email, String senha, String cpf, int telefone) {
        this.id = id;
        this.nome = nome;
        this.genero = genero;
        this.email = email;
        this.senha = senha;
        this.cpf = cpf;
        this.telefone = telefone;
    }
    

    public Pessoa(String nome, String genero, String email, String senha, String rg, String cpf, int telefone) {
        this.nome = nome;
        this.genero = genero;
        this.email = email;
        this.senha = senha;
        this.cpf = cpf;
        this.telefone = telefone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
}
