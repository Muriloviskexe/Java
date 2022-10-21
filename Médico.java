
package ClinicaMédica;


public class Médico {
    private String nome;
    private int CRM;

    public Médico(String nome, int CRM) {
        this.nome = nome;
        this.CRM = CRM;
        
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCRM() {
        return CRM;
    }

    public void setCRM(int CRM) {
        this.CRM = CRM;
    }
    
    void Status(){
        System.out.println("Foi marcada uma consulta para o médico "+this.nome);
    }
    
    
}
