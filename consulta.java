
package ClinicaMédica;


public class consulta {
    private float horaConsulta;

    public consulta(float horaConsulta) {
        this.horaConsulta = horaConsulta;
    }

    public float getHoraConsulta() {
        return horaConsulta;
    }

    public void setHoraConsulta(float horaConsulta) {
        this.horaConsulta = horaConsulta;
    }
    void Status(){
        System.out.println("Uma consulta foi marcada para as "+this.horaConsulta);
        
    }
    
    
    
}
