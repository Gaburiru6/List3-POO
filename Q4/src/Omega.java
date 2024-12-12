public class Omega extends Opala implements Alarme{
    //equivale a C5
    String litragem;
    public Omega(String Nome, String cor, String litragem) {
        super(Nome, cor);
        this.litragem = litragem;
    }

    //sobreposição de metodos
    @Override
    void motor(){
        System.out.println("este carro tem um motor 6 cilindros modelo Alloytec de "+litragem+" litros");
    };

    public void alarme() {
        System.out.println("Este carro possui alarme");
    }
}
