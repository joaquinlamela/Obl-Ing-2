package dominio;

import java.io.Serializable;
import java.util.ArrayList;

public final class Conversacion implements Serializable {

    private ArrayList<InformacionMensaje> listaMensajes;
    private Persona usuario;
    private Persona profesional;
    private boolean fueAtendidaConsulta;

    public Conversacion(Persona user, Persona profesional, ArrayList<InformacionMensaje> lista) {
        setUsuario(user);
        setProfesional(profesional);
        setListaMensajes(lista);
        setFueAtendidaConsulta(false);
    }

    public boolean getFueAtendidaConsulta() {
        return fueAtendidaConsulta;
    }

    public void setFueAtendidaConsulta(boolean fueAtendida) {
        this.fueAtendidaConsulta = fueAtendida;
    }

    public ArrayList<InformacionMensaje> getListaMensajes() {
        if (this.listaMensajes.isEmpty()) {
            return new ArrayList<>();
        }
        return this.listaMensajes;
    }

    public void setListaMensajes(ArrayList<InformacionMensaje> lista) {
        if (lista == null || lista.isEmpty()) {
            this.listaMensajes = new ArrayList<>();
        } else {
            this.listaMensajes = lista;
        }
    }

    public Persona getUsuario() {
        return usuario;
    }

    public void setUsuario(Persona unUsuario) {
        if (unUsuario == null) {
            this.usuario = new Usuario(null, null, null, null, null, null, null, null);
        } else {
            this.usuario = unUsuario;
        }
    }

    public Persona getProfesional() {
        return this.profesional;
    }

    public void setProfesional(Persona unProfesional) {
        if (unProfesional == null) {
            this.profesional = new Profesional(null, null, null, null, null, null, null);
        } else {
            this.profesional = unProfesional;
        }
    }

    public boolean agregarMensaje(String mensaje, boolean intercambioRemitente) {
        InformacionMensaje informacion = new InformacionMensaje(getUsuario().getNombreCompleto(), 
                getProfesional().getNombreCompleto(), mensaje);
        if (intercambioRemitente) {
            informacion.intercambiarRemitente();
        }
        listaMensajes.add(informacion);
        return true;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false; 
        } else if (this.getClass() != obj.getClass()) {
            return false; 
        } else {
        final Conversacion conversacionParametro = (Conversacion) obj;
        return getProfesional().equals(conversacionParametro.getProfesional())
                && getUsuario().equals(conversacionParametro.getUsuario());    
        }
        
    }

    @Override
    public String toString() {
        String retorno = "No hay mensajes para mostrar";
        if (!getListaMensajes().isEmpty()) {
            retorno = "";
            retorno = listaMensajes.stream().map((InformacionMensaje info) -> "\n" 
                    + info.getRemitente() + "\n"
                    + info.getMensaje() + "\n").reduce(retorno, String::concat);
        }
        return retorno;
    }
    
    @Override
    public int hashCode() {
        return 7;
    }

}
