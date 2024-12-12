public class Opala extends Carro{
    //equivale a C2
    String cor;

    public Opala(String Nome, String cor) {
        super(Nome);
        this.cor = cor;
    }

    void motor(){
        System.out.println("este carro tem um motor 6 cilindros modelo 250");
    };
}
