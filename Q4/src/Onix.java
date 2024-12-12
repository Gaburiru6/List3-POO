public class Onix extends Carro implements Alarme, Opcionais{
    //equivale a C3
    String versao = "basico";

    //sobrecarga de construtores
    public Onix(String Nome) {
        super(Nome);
    }

    public Onix(String Nome, String versao){
        super(Nome);
        this.versao = versao;
    }

    void airbag(){
        System.out.println("Este carro possui airbag");
    }

    public void alarme() {
        System.out.println("Este carro possui alarme");
    }

    public void arCondicionado() {
        System.out.println("este carro possui ar condicionado");
    }

    public void vidroEletrico() {
        System.out.println("este carro possui vidro eletrico");
    }
}
