// PACKAGES
package model;

// IMMPORTS
import javax.swing.JOptionPane;

public abstract class Pessoa {

   // ATTRIBUTES ===============================================================
   private String nome;
   private int idade;
   public static final String TITULO = "Doutor";
   public static final String CURSO = "Computação";

   // CONSTRUCTORS =============================================================
   public Pessoa() {
      this("", 0);
   }

   public Pessoa(String nome, int idade) {
      this.nome = nome;
      this.idade = idade;
   }

   // GETTER / SETTER ==========================================================
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

   // OTHER METHODS ============================================================
   public abstract String getNomeFormatado();
   
   public void cadastrar() {
      setNome(JOptionPane.showInputDialog("NOME"));
      setIdade(Integer.parseInt(JOptionPane.showInputDialog("IDADE")));
   }

   public String imprimir() {
      return "NOME: " + getNome() + "\nIDADE: " + getIdade();
   }

}
