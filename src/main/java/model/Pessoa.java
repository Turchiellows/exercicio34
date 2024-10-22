
package model;

import java.util.Scanner;

public class Pessoa {
   private String nome;
   private int idade;

    public Pessoa() {
      this("", 0);
   }
   public Pessoa(String nome, int idade) {
      this.nome = nome;
      this.idade = idade;
   }

   public String getNome() {
      return nome;
   }

   public void setNome(String nome) {
      this.nome = nome;
   }

   public int getIdade() {
      return idade;
   }

   public void setIdade(int idade) {
      this.idade = idade;
   }
   
   
   public void cadastrar() {
      Scanner sc = new Scanner(System.in);
      System.out.println("Digite o nome: ");
      setNome(sc.nextLine());
      System.out.println("Digite a idade: ");
      setIdade(sc.nextInt());
   }
   
   
   public String imprimir() {
      return "Nome: " + getNome() + "\nIDADE: " + getIdade();
   }
     
}
