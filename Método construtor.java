///Um construtor nada mais é que um método que recebe o mesmo nome de sua classe, não havendo indicação de retorno ou void.
//O construtor é normalmente utilizado para fornecer valores iniciais para variáveis de instâncias definidas pela classe ou uma forma de inicialização de um objeto já formado, ou seja, um construtor inicializa um objeto.
//Todas as classes, por padrão, já possuem construtores, visto que o próprio JAVA já fornece construtores padrões para inicialização de variáveis com seus valores padrão e, ao criarmos nosso próprio construtor, automaticamente o construtor padrão deixa de ser utilizado.
//Um exemplo de construtor:

public class Construtores {

Integer x;
Integer y;

public Construtores(){  // Construtor padrão
} 

public Construtores(Integer x, Integer y){ // Construtor com 2 parâmetros
this.x = x;
this.y = y;
}

//A palavra "this" é uma referência para o próprio objeto.
//Exemplo de aplicação prática de construtores:

public class Employee{

  protected String name;
    protected Integer hours;
    protected Double valuePerHour;

  public Employee(){
  }
  
  public Employee(String name, Integer hours, Double valuePerHour){
  this.name = name;
  this.hours = hours;
  this.valuePerHour = valuePerHour;
  }
}
  // no main 
public class Main{

public static void main(String[] args) {

Employee e1 = new Employee("Pedro", 20, 25.00)

}
}          
