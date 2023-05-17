package TADs;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Pessoa> peoples = new ArrayList<Pessoa>();

        Pessoa p1 = new Pessoa();

        p1.setNome("Maria");
        p1.setIdade(18);

        peoples.add(p1);

        Pessoa p2 = new Pessoa("Pedro", 20);

        peoples.add(p2);

        Pessoa p3 = new Pessoa("Joao", 41);

        peoples.add(p3);

        System.out.println("Lista de pessoas: ");
        for (Pessoa pessoas : peoples){
            System.out.print("-" + pessoas.getNome() + " ");
            System.out.print(pessoas.getIdade() + "\n");
        }

        //EXIBIR A PESSOA COM MAIOR IDADE DO CONJUNTO
        System.out.println();

        int a = 0;
        String b = "";

        for (Pessoa pes : peoples){
            if ( a < pes.getIdade()){
                a = pes.getIdade();
                b = pes.getNome();
            }
        }

        System.out.print("A pessoa com maior idade é " + b + " com " + a +" anos");

    }
}
