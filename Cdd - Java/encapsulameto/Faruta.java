package encapsulameto;

public class Faruta {
    private String numero;
    private String descricao;
    private int QuatidadeComprada;
    private double preco;
    private double totalFatura;
    
    public Faruta(String numero, String descricao, int quatidadeComprada, double preco) {
        this.numero = numero;
        this.descricao = descricao;
        this.QuatidadeComprada = quatidadeComprada;
        this.preco = preco;
        this.totalFatura = totalFatura;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuatidadeComprada() {
        return QuatidadeComprada;
    }

    public void setQuatidadeComprada(int quatidadeComprada) {
        QuatidadeComprada = quatidadeComprada;
    }
    
    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco < 0){
            this.preco = 0;
        } else {
            this.preco = preco;
        }
    }
    
    public double getTotalFatura() {
        return getTotalFatura();
    }
    
    public void setTotalFatura(double totalFatura) {
        if (totalFatura < 0){
            this.totalFatura = 0;
        } else {
            this.totalFatura = totalFatura;
        }
    }


}
