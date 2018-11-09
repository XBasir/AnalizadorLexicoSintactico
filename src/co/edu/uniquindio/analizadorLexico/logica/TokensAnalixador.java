package co.edu.uniquindio.analizadorLexico.logica;

import java.util.logging.Logger;

/**
 *
 *@author XBASIR.
 * 

 */
public class TokensAnalixador {

    private String categoria,lexema;

    private Integer linea,lineaSiguiente;

   public static final String PALABRAS_RESERVADAS ="Palabra reservada";
   public static final String VALORES_NUMERICOS ="Numerico";
   public static final String OPERADORES_MATEMATICOS ="Operd Matematico";
   public static final String OPERADOR_ASIGNACION ="Operad Asignacion";
   public static final String CADENA_PALABRAS ="Cadena de palabra";
   public static final String TIPOS_VARIABLES ="Variable";
   public static final String NOMBRES_DE_VARIABLES ="Nombre de variable ";
   public static final String SIMBOLOS ="Simbolo ";
    public static final String SIMBOLOS_NO_RECONOCIDOS ="Simbolo no reconocido ";
    public static final String METODO_MOVER="Metodo de mover";
    public static final String LETRA="Letra";
     public static final String SEPARADOR="Separador de sentencia";
     public static final String COMPARACIONES="Operadores de comparacion";
    
   
   
    /**
     * Metodo constructor de la clase TokensAnalizador
     * @param categoria
     * @param lexema
     * @param linea
     * @param lineaSiguiente 
     */
    public TokensAnalixador(String categoria, String lexema, Integer linea, Integer lineaSiguiente) {
        this.categoria = categoria;
        this.lexema = lexema;
        this.linea = linea;
        this.lineaSiguiente = lineaSiguiente;
    }
    
    /**
     * Metodos getters y setters de los atributos
     */
    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getLexema() {
        return lexema;
    }

    public void setLexema(String lexema) {
        this.lexema = lexema;
    }

    public Integer getLinea() {
        return linea;
    }

    public void setLinea(Integer linea) {
        this.linea = linea;
    }

    public Integer getLineaSiguiente() {
        return lineaSiguiente;
    }

    public void setLineaSiguiente(Integer lineaSiguiente) {
        this.lineaSiguiente = lineaSiguiente;
    }


   

   
   
    
    
}
