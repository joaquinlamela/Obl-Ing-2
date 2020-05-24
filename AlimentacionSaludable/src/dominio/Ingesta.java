package dominio;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Arrays;

public final class Ingesta implements Serializable {

    public String fechaDeIngesta;
    private ArrayList<Alimento> listaAlimentosPorFecha;

    public Ingesta(String f, ArrayList<Alimento> listaAlimento) {
        setFechaDeIngesta(f);
        setListaAlimentosPorFecha(listaAlimento);
    }

    public String getFechaDeIngesta() {
        return this.fechaDeIngesta;
    }

    public void setFechaDeIngesta(String unaFecha) {
        if (unaFecha == null || unaFecha.isEmpty()) {
            this.fechaDeIngesta = "Fecha de ingesta no registrada";
        }
        else {
            this.fechaDeIngesta = unaFecha;
        }
    }

    public ArrayList<Alimento> getListaAlimentosPorFecha() {
        if (this.listaAlimentosPorFecha.isEmpty()) {
            return new ArrayList<>();
        } else {
            return this.listaAlimentosPorFecha;
        }
    }

    public void setListaAlimentosPorFecha(final ArrayList<Alimento> listaAlimentos) {
        if (listaAlimentos == null || listaAlimentos.isEmpty()) {
            this.listaAlimentosPorFecha = new ArrayList<Alimento>();
        }
        else {
            this.listaAlimentosPorFecha = listaAlimentos;
        }
    }

    @Override
    public String toString() {
        if (this.listaAlimentosPorFecha.isEmpty()) {
            return "No hay alimentos ingeridos";
        } else {
            return "Lista de alimentos ingeridos" + this.getListaAlimentosPorFecha();
        }
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==null){
            return false; 
        }else if(this.getClass() != obj.getClass()){
            return false; 
        }else{
        Ingesta otraIngesta = (Ingesta) obj;
        boolean sonIguales = this.getFechaDeIngesta().equals(otraIngesta.getFechaDeIngesta());
        sonIguales = sonIguales && this.getListaAlimentosPorFecha().equals(otraIngesta.getListaAlimentosPorFecha());
        return sonIguales;    
        }
        
        
    }
    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + Objects.hashCode(this.fechaDeIngesta);
        hash = 17 * hash + Objects.hashCode(this.listaAlimentosPorFecha);
        return hash;
    }

}
