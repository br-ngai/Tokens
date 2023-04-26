import java.util.*;
/*
@author victor cruz
@email victor.cruz.arrona@gmail.com
@description Clase generadora de tokens
*/

public class Tokens{

	//psvm
  /*
    @method metodo principal
  	@description Clase generadora de tokens
	*/
   public static void main (String[] args){
     Token token = new Token();
     System.out.println(token.obtenerAlfabeto());
     System.out.println(token.generarToken());
   }//fin de main
  

}//fin clase Myclass

/*
@author victor cruz
@email victor.cruz.arrona@gmail.com
@description Clase generadora de tokens
*/
class Token{
  /*
    @method metodo principal
  	@description Clase generadora de tokens
	*/
  public String obtenerAlfabeto(){
    
    String alfabeto ="";
     char x = 'A';
    for (int i =0;i<=25;i++){
      String charToString =String.valueOf(x++);
      System.out.println(charToString);
      //iteramos caracter y concatenamos en alfabeto
      alfabeto=alfabeto.concat(charToString);      
    }// fin de while
    return alfabeto;
  }//
  public String generarToken(){
    String token="";
    Random random = new Random();
     //Caracter de token
    String alfabeto = obtenerAlfabeto();
    for(int i=0;i<=3;i++){
    	char c = alfabeto.charAt(random.nextInt(alfabeto.length()));
      String charToString =String.valueOf(c);
      token = token.concat(charToString);
    }    
   return token;
  }
}// fin de clase token