
public class Main{	
	public static void main (String[] args){
		Texto texto1 = new Texto("hola");
		Hoja hoja1 = new Hoja();
		Hoja hoja2 = new Hoja();
		
		Kalimba editor = new Kalimba();
		editor.hojaActiva = new Hoja();
		editor.hojaActiva.agregarTexto(texto1);
		editor.imprimirHojaActiva();
		texto1.imprimir();
		editor.Hojas.add(hoja1);
		editor.Hojas.add(hoja2);
		System.out.println(editor.Hojas);
		
		
		
	}
}