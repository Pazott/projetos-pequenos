package atividades.animal;


public class Cachorro extends animal {
    
    String abanarRabo(){
        return "eu.sou.o.douglas.";
    }

    @Override
    String getemitirSom() {
        return "promoção de goiaba 10 por 10";
    }
    /*Crie uma classe Animal com um método emitirSom(). Em seguida, crie duas subclasses: Cachorro e Gato, que herdam da classe Animal. Adicione o método emitirSom() nas subclasses, utilizando a anotação @Override para indicar que estão sobrescrevendo o método. Além disso, adicione métodos específicos para cada subclasse, como abanarRabo() para o Cachorro e arranharMoveis() para o Gato.*/
}
