public class Vetores {



    public static void main(String[] args) {


        int vetor[] = {1,2,3,4,5,6,7,8,9,10};

        System.out.println("Busca iterativa:");
        buscaIterativa(vetor,2);
        System.out.println();

        System.out.println("Busca recursiva: ");
        buscaRecursiva(vetor,0, 4);
        System.out.println();

        System.out.println("Vetor invertido: ");
        inverterVetor(vetor);

    }

    public static void buscaIterativa(int a[],int valor) {


        for (int i = 1; i < a.length; i++) {
            if (a[i] == valor){
                System.out.println("O valor " + valor + " esta na posicao " + (i+ 1));
            }
        }
    }



    public static void buscaRecursiva(int [] arr, int index, int valor){

        if (arr[index] == valor){
            System.out.println("O valor " + valor + " esta na posicao " + (index + 1));
        }

        if (index < arr.length - 1){
            buscaRecursiva(arr,index + 1, valor);
        }

    }

    public static void inverterVetor(int arr[]){

        int a = 0;
        int b = arr.length - 1;

        while(a < b){
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
            a++;
            b++;
        }

    }

}