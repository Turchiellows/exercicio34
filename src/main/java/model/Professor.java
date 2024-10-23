// PACKAGES
package model;

// IMPORTS
import javax.swing.JOptionPane;

public class Professor extends Pessoa {
   // ATTRIBUTES ===============================================================

   private double salario;
   private String titulo;

   // CONSTRUCTORS =============================================================
   public Professor() {
      this("", 0, 0, "");
   }

   public Professor(String nome, int idade, double salario, String titulo) {
      super(nome, idade);
      this.salario = salario;
      this.titulo = titulo;
   }

   // GETTER / SETTER ==========================================================
   public double getSalario() {
      return salario;
   }

   public void setSalario(double salario) {
      this.salario = salario;
   }

   public String getTitulo() {
      return titulo;
   }

   public void setTitulo(String titulo) {
      this.titulo = titulo;
   }

   // OTHER METHODS ============================================================
   public void cadastrar() {
      super.cadastrar();
      setSalario(Double.parseDouble(JOptionPane.showInputDialog("SALÁRIO")));
      setTitulo(JOptionPane.showInputDialog(null, "TÍTULO", TITULO));
   }

   public String imprimir() {
      return super.imprimir() + "\nSALÁRIO: " + getSalario() + "\nTÍTULO: " + getTitulo();
   }
   
      @Override
   public String getNomeFormatado() {
      return "NOME: " + getTitulo() + " " + super.getNome();
   }

}
