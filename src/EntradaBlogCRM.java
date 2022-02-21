
/**
 * @author 21/02/2022 CRM Cristian 
 *
 */
public class EntradaBlogCRM {

	/** 21/02/2022 CRM 
	 * separador es el ccar�cter que separa ENTRADA DE del nombre del autor
	 */
	public static char separador=':';
	private int id;
	private String texto;
	private String autor;

	/** 21/02/2022 CRM
	 * @param id N�mero de entrada
	 * @param autor Nombre del autor
	 * @param texto El texto que contiene la entrada
	 * @throws IllegalArgumentException Si el n�mero de entrada es negativo, lanza una excepci�n
	 */
	public EntradaBlogCRM(int id,String autor,String texto)throws IllegalArgumentException{
		if(id<=0) throw new IllegalArgumentException("El id no puede ser negativo");
		this.id=id;
		this.autor=autor;
		this.texto=texto;
	}
	@Override
	public String toString(){
		String cad="";
		cad+="\nENTRADA DE"+separador+autor;
		cad+="\n "+texto;
		return cad;
	}
	
	/** 21/02/2022 CRM
	 * @return Devuelve el n�mero de la entrada
	 */
	public int getId(){
		return this.id;
	}
	
	/** 21/02/2022 CRM
	 * @return Devuelve el texto completo de la entrada
	 */
	public String getTexto(){
		return this.texto;
	}
	
	/** 21/02/2022 CRM
	 * @return Devuelve el nombre del autor de la entrada en may�sculas
	 */
	public String getAutor(){
		return this.autor.toUpperCase();
	}
	 
	/** 21/02/2022 CRM
	 * @return Devuelve el nombre del autor. Ya no se usa. Mejor ver getAutor
	 */
	public String devuelveAutor(){
		return this.autor;
	}
	
	/** 21/02/2022 CRM
	 * @param args No tiene porqu� tener argumentos.
	 */
	public static void main(String[] args) {
               
		EntradaBlogCRM e1=new EntradaBlogCRM (3,"ana","�ltimas noticias, est� disponible BixBy 2.0");
		System.out.println(e1);
	}
}