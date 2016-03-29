
package proyecto_busqueda_anchura;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class Cola {
    
    ArrayList<Estado> estados;

    public Cola() {
        this.estados = new ArrayList<Estado>();
    }
    public void agregar(Estado nuevo)
    {
        this.estados.add(nuevo);
    }        
    Estado tomar()
    {
        Estado e = this.estados.get(0);
        this.estados.remove(0);
        return e;
        
    }
    @Override
    public String toString() {
        return "Cola{" + "estados=" + estados + '}';
    }
    
    
    
}
