public class Caravan extends Opala{
    //equivale a C4
    int ano;

    public Caravan(String Nome, String cor, int ano) {
        super(Nome, cor);
        this.ano = ano;
    }

    void estepe(){
        System.out.println("este carro possui estepe");
    };
}
