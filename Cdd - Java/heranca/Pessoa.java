package heranca;

import java.util.Date;

public class Pessoa {
    public String nome;
    public String cpf;
    public Date dataNascimeto;

    public Pessoa(String _nome, String _cpf, Date _data){
        this.nome = _nome;
        this.cpf = _cpf;
        this.dataNascimeto = _data;
    }
}
