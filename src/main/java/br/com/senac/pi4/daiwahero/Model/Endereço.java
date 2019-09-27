package br.com.senac.pi4.daiwahero.Model;
/**
 *
 * @author Deyvid
 */
public class Endereço {
    
    private String endereço;
    private String bairro;
    private String cidade;
    private String uf;
    private String cep;
    private String complemento;
    private int numero;

    public Endereço() {
    }
    
    public Endereço(String endereço, String bairro, String cidade, String uf, String cep, String complemento, int numero) {
        this.endereço = endereço;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
        this.cep = cep;
        this.complemento = complemento;
        this.numero = numero;
    }
    
    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    
}
