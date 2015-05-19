import java.util.ArrayList;
import java.util.List;

public class Hoja {
	List <Texto> textos = new ArrayList<Texto>();
	
	
 public void agregarTexto(Texto texto){
	 this.textos.add(texto);
	
 }
 
 public void imprimirHoja(){
	 System.out.println(this.textos);
 
 }
 
}
 