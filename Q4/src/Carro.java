public abstract class Carro {
    //equivale a C1
    String Nome;

    public Carro(String Nome){
        this.Nome = Nome;
    }

    //sobrecarga de metodos
    void Acelerar(){
        System.out.println("Acelerando");
    };

    void Acelerar(int marcha){
        System.out.println("Acelerando com a "+marcha+"° marcha");
    };

}
