package apsdad;
// Generated Oct 18, 2016 2:05:54 PM by Hibernate Tools 4.3.1



/**
 * Mensagens generated by hbm2java
 */
public class Mensagens  implements java.io.Serializable {


     private Integer id;
     private String remetente;
     private String destinatario;
     private String assunto;
     private String mensgem;

    public Mensagens() {
    }

    public Mensagens(String remetente, String destinatario, String assunto, String mensgem) {
       this.remetente = remetente;
       this.destinatario = destinatario;
       this.assunto = assunto;
       this.mensgem = mensgem;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getRemetente() {
        return this.remetente;
    }
    
    public void setRemetente(String remetente) {
        this.remetente = remetente;
    }
    public String getDestinatario() {
        return this.destinatario;
    }
    
    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }
    public String getAssunto() {
        return this.assunto;
    }
    
    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }
    public String getMensgem() {
        return this.mensgem;
    }
    
    public void setMensgem(String mensgem) {
        this.mensgem = mensgem;
    }




}


