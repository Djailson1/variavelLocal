package variavelLocal.curso;

public class ExercicioJava {
	static int global = 40;

	public static void main(String []args ){

	int local = 10;
	  System.out.println(local);
	  alg2();
	  System.out.println(global);
	  
	  //imprimindo local e global no método de inicialização main
	  
	}
	public static void alg2(){

	  System.out.println(global);
	}

}
