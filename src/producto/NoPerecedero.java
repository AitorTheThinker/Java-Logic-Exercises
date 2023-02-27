package producto;

public class NoPerecedero extends Producto{
    
    //Atributos
    private String tipo;
 
    //constructores
    public NoPerecedero(String tipo, String nombre, double precio) {
        super(nombre, precio);
        this.tipo = tipo;
    }
 
    //Metodos
    public String getTipo() {
        return tipo;
    }
 
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
 
    @Override
    public String toString() {
        return super.toString() + " tipo=" + tipo + '}';
    }
     
     
}
