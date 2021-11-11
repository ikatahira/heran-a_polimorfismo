public class Teste {
    public static void main(String[] args) {

        Pessoa pessoa =new Pessoa();
        Pessoa aluno=new Aluno();
        Pessoa professor=new Professor();
        pessoa.setEndereco("Pompeia");
        aluno.setEndereco("Marília");
        professor.setEndereco("Palmital");

        System.out.println(pessoa.obterEtiquetaEndereco());
        System.out.println(aluno.obterEtiquetaEndereco());
        System.out.println(professor.obterEtiquetaEndereco());
        
    }
    
}
