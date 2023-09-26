public class jogov1 {
    public static void main(String[] args) {
    
        //1. Construir objeto personagem
        var p = new Personagem();
        //2. Dar um nome pra ele
        p.nome = "John";
        p.energia = 10;
        p.fome = 0;
        p.sono = 0;
        //3. fazer ele caçar
        p.cacar();
        //4. fazer ele comer
        p.comer();
        //5. fazer ele dormir
        p.dormir();
    }
}
