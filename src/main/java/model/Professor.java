package model;

import java.util.Scanner;

public class Professor extends Pessoa {

   private String curso;
   private double salario;

   public Professor() {
      this("", 0, "", 0);
   }

   public Professor(String nome, int idade, String curso, double salario) {
      super(nome, idade);
      this.curso = curso;
      this.salario = salario;
   }

   public String getCurso() {
      return curso;
   }

   public void setCurso(String curso) {
      this.curso = curso;
   }

   public double getSalario() {
      return salario;
   }

   public void setSalario(double salario) {
      this.salario = salario;
   }

   public void cadastar() {
      super.cadastrar();
      Scanner sc = new Scanner(System.in);
      System.out.println("Digite o curso: ");
      setCurso(sc.nextLine());
      System.out.println("Digite o salário: ");
      setSalario(sc.nextDouble());
   }

   @Override
   public String imprimir() {
      return super.imprimir() + "CURSO: " + getCurso();
   }

}
