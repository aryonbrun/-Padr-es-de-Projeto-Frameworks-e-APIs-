package Exercicio1;

public class Principal {
    public static void main(String[] args) throws Exception {

        EmpregadoFactory factory = new EmpregadoFactory();

        int cargo, anoContracacao;
        String nome, email;

        cargo = 1;
        nome = "Aryon";
        email = "aryon@gmail.com" ;
        anoContracacao = 2014;

        int cargob = 2;
        String nomeb = "Pablo";
        String emailb = "pablo@gmail.com" ;
        int anoContracacaob = 2021;

        Empregado emp1 = EmpregadoFactory.getEmpregado(1, nome, email, anoContracacao);
        System.out.println(emp1.toString());

        EmpregadoFactory emp2 = EmpregadoFactory.getEmpregado(cargob,nomeb,emailb,anoContracacaob);
        System.out.println((emp2));


    }
}
