public class Pilha {

    public Object arranjo[];
    public int MAX_TAM = 16;
    public int topo = 0;

    public Pilha() {
        this.arranjo = new Object[MAX_TAM];
        this.topo = 0;
    }

    public void empilhar(Object elemento){
        arranjo[topo] = elemento;
        topo++;
    }

    public int tamanhoPilha(){
        return topo;
    }

    public void esvaziaPilha(){
        System.out.println(arranjo[topo-1]);
        topo--;
    }

    public static void main(String[] args) {
        Pilha pilha = new Pilha();

        String texto = "TEXTO DE ENTRADA";
        char frase[] = texto.toCharArray();

        for (char letra : frase){
            pilha.empilhar(letra);
        }

        while(pilha.tamanhoPilha() > 0){
            pilha.esvaziaPilha();
        }



    }
}
