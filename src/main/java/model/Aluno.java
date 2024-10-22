package model;

import java.util.Scanner;

public class Aluno extends Pessoa {

   private String curso;

   public Aluno() {
      this("", 0, "");
   }

   public Aluno(String nome, int idade, String curso) {
      super(nome, idade);
      this.curso = curso;
   }

   public String getCurso() {
      return curso;
   }

   public void setCurso(String curso) {
      this.curso = curso;
   }

   public void cadastar() {
      super.cadastrar();
      Scanner sc = new Scanner(System.in);
      System.out.println("Digite o curso: ");
      setCurso(sc.nextLine());
   }
   
   
   @Override
   public String imprimir() {
      return super.imprimir() + "CURSO: " + getCurso();
   }

}
