public class Personagem{
    //Variáveis de instância
    //Instância é sinônimo de objeto.
    String nome;
    int energia;
    int fome;
    int sono;
    //tipo de retorno
    //Nome
    //Lista de parâmetros
    //corpo

    void cacar(){
        if (energia >= 2){
            energia = energia -2;
            System.out.println(nome + " caçando");
        }
        else{
            System.out.println(nome + " Sem energia para caçar");
        }
            fome = Math.min(fome +1, 10);
            sono = sono + 1 > 10 ? 10 : sono + 1;
    }

    void comer(){
        if (fome >= 1){
        System.out.printf("%s comendo\n", nome);
        --fome;
        energia = Math.min(energia +1, 10);
        }
        else{
            System.out.println(nome + " sem fome");
        }
    }

    void dormir(){
        if (sono >= 1){
            System.out.print(nome + " Dormindo\n");
            sono--;
            energia = energia +1 <= 10 ? energia + 1 : 10;
        }
        else{
            System.out.println(nome + " Sem sono");
        }
    }
    void exibirEstado(){
        System.out.printf(
            "%s: e: %d, f: $d, s: $d\n"
            nome, 
            energia,
            fome,
            sono,
        )
    }
}