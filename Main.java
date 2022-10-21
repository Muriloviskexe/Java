/*
Três classes,
-Médico
*CRM
*Nome

-Paciente (ok)
*nome
*idade
*telefone
*cpf

-Consulta
*data



*/
// Crie o Paciente João que tem uma consulta com o médicom Pedro no dia 22/10/2023
// Crie o Paciente Marcela que tem uma consulta com o médicom Rafael no dia 22/10/2023
// Crie o Paciente Regina que tem uma consulta com o médicom Carla no dia 22/10/2023


package ClinicaMédica;


public class Main {
    public static void main(String[] args) {
        
        Paciente p1 = new Paciente("joão", 9684684, 484984, 19);
        
        Médico m1 = new Médico("Pedro", 16468487);
        
        consulta c1 = new consulta(1520);
        
        p1.Status();
        m1.Status();
        c1.Status();
    }


    }

    


