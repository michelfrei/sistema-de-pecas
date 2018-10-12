
package Model;

/**
 *
 * @author Michel
 */

public class ClienteModel {
    private String NomeRazao;
    private String CPF_CNPJ;
    private String RG;
    private String Endereco;
    private int Numero;
    private String Complemento;
    private String Cidade;
    private String Estado;
    private String CEP;
    private String Telefone;
    private String Celular;
    private String Email;
    private String VencimentoConta;
    private double Debito;
    private boolean Ativo;
    
    public ClienteModel(){
    }

    public ClienteModel(String NomeRazao, String CPF_CNPJ, String RG, String Endereco, int Numero, String Complemento, String Cidade, String Estado, String CEP, String Telefone, String Celular, String Email, String VencimentoConta, double Debito, boolean Ativo) {
        this.NomeRazao = NomeRazao;
        this.CPF_CNPJ = CPF_CNPJ;
        this.RG = RG;
        this.Endereco = Endereco;
        this.Numero = Numero;
        this.Complemento = Complemento;
        this.Cidade = Cidade;
        this.Estado = Estado;
        this.CEP = CEP;
        this.Telefone = Telefone;
        this.Celular = Celular;
        this.Email = Email;
        this.VencimentoConta = VencimentoConta;
        this.Debito = Debito;
        this.Ativo = Ativo;
    }

    public String getNomeRazao() {
        return NomeRazao;
    }

    public void setNomeRazao(String NomeRazao) {
        this.NomeRazao = NomeRazao;
    }

    public String getCPF_CNPJ() {
        return CPF_CNPJ;
    }

    public void setCPF_CNPJ(String CPF_CNPJ) {
        this.CPF_CNPJ = CPF_CNPJ;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    public int getNumero() {
        return Numero;
    }

    public void setNumero(int Numero) {
        this.Numero = Numero;
    }

    public String getComplemento() {
        return Complemento;
    }

    public void setComplemento(String Complemento) {
        this.Complemento = Complemento;
    }

    public String getCidade() {
        return Cidade;
    }

    public void setCidade(String Cidade) {
        this.Cidade = Cidade;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    public String getCelular() {
        return Celular;
    }

    public void setCelular(String Celular) {
        this.Celular = Celular;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getVencimentoConta() {
        return VencimentoConta;
    }

    public void setVencimentoConta(String VencimentoConta) {
        this.VencimentoConta = VencimentoConta;
    }

    public double getDebito() {
        return Debito;
    }

    public void setDebito(double Debito) {
        this.Debito = Debito;
    }

    public boolean isAtivo() {
        return Ativo;
    }

    public void setAtivo(boolean Ativo) {
        this.Ativo = Ativo;
    }

    
    
    
    
}
