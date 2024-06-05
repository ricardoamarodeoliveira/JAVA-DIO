public class SmartTv{

    /*visitar o link abaixo para conferir as 52 palavras reservadas em java
       * http://www.linhadecodigo.com.br/artigo/83/as-52-palavras-reservadas-do-java.aspx
       *estudar documentação java
       */

    boolean ligada = false;
    int canal = 1;
    int volume = 9;

    //no caso acima temos variaveis que seriam globais e estão disponiveis para serem usadas, no entanto
    // temos o exemplo da variavel novoCanal que é local e só pode ser acessada dentro de mudarCanal e por ninguem mais

    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }

    public void aumentarVolume(){

        volume++;
    }

    public void aumentarCanal(){
        

        canal++;
    }

    public void mudarCanal(int novoCanal){

        canal = novoCanal;

        

    }

}