//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Opala Opala = new Opala("Opala","Preto");
        Onix Onix = new Onix("Onix");
        Onix OnixPremier = new Onix("Onix", "Premier");
        Caravan Caravan = new Caravan("Caravan","Laranja",1976);
        Omega Omega = new Omega("Omega", "Branco", "4.1");

        System.out.println("Ficha dos veiculos");
        System.out.println("----------------------------------------");
        System.out.println(Opala.Nome);
        System.out.println(Opala.cor);
        Opala.motor();

        System.out.println("----------------------------------------");
        System.out.println(Onix.Nome);
        System.out.println(Onix.versao);
        Onix.airbag();
        Onix.alarme();
        Onix.arCondicionado();
        Onix.vidroEletrico();

        System.out.println("----------------------------------------");
        System.out.println(OnixPremier.Nome);
        System.out.println(OnixPremier.versao);
        OnixPremier.airbag();
        OnixPremier.alarme();
        OnixPremier.arCondicionado();
        OnixPremier.vidroEletrico();

        System.out.println("----------------------------------------");
        System.out.println(Caravan.Nome);
        System.out.println(Caravan.cor);
        System.out.println(Caravan.ano);
        Caravan.motor();

        System.out.println("----------------------------------------");
        System.out.println(Omega.Nome);
        System.out.println(Omega.cor);
        Omega.motor();
        Omega.alarme();

        System.out.println("----------------------------------------");
        System.out.println("agora uma demostração de motores");
        System.out.println(Opala.Nome);
        Opala.Acelerar();
        System.out.println(Onix.Nome+Onix.versao);
        Onix.Acelerar(1);
        System.out.println(OnixPremier.Nome+OnixPremier.versao);
        OnixPremier.Acelerar(2);
        System.out.println(Caravan.Nome);
        Caravan.Acelerar(3);
        System.out.println(Omega.Nome);
        Omega.Acelerar(4);
    }
}