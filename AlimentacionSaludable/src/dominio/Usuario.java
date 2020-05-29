package dominio;

import java.util.ArrayList;
import javax.swing.ImageIcon;

public final class Usuario extends Persona {

    private String nacionalidad;
    private ArrayList<String> preferencias;
    private ArrayList<String> restricciones;
    private ArrayList<Ingesta> alimentosIngeridos;

    public Usuario(String unNombre,
            String unApellido,
            String unaFechaNacimiento,
            ImageIcon unaFotoDePerfil,
            String unaNacionalidad,
            ArrayList<String> listaPreferencias,
            ArrayList<String> listaRestricciones,
            ArrayList<Ingesta> listaAlimentos) {

        this.setNombre(unNombre);
        this.setApellido(unApellido);
        this.setFechaNacimiento(unaFechaNacimiento);
        this.setFotoDePerfil(unaFotoDePerfil);
        this.setNacionalidad(unaNacionalidad);
        this.setPreferencias(listaPreferencias);
        this.setRestricciones(listaRestricciones);
        this.setAlimentosIngeridos(listaAlimentos);
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String unaNacionalidad) {
        if (unaNacionalidad == null || unaNacionalidad.isEmpty()) {
            this.nacionalidad = "Nacionalidad no ingresada";
        }
        else {
            this.nacionalidad = unaNacionalidad;
        }
    }

    public ArrayList<String> getPreferencias() {
        return this.preferencias;
    }

    public void setPreferencias(ArrayList<String> listaPreferencias) {
        if (listaPreferencias == null) {
            this.preferencias = new ArrayList<>();
        } else {
            this.preferencias = listaPreferencias;
        }
    }

    public ArrayList<String> getRestricciones() {
        return this.restricciones;
    }

    public void setRestricciones(ArrayList<String> listaRestricciones) {
        if (listaRestricciones == null) {
            this.restricciones = new ArrayList<>();
        } else {
            this.restricciones = listaRestricciones;
        }
    }

    public ArrayList<Ingesta> getAlimentosIngeridos() {
        return this.alimentosIngeridos;
    }

    public void setAlimentosIngeridos(ArrayList<Ingesta> listaAlimentos) {
        if (listaAlimentos == null) {
            this.alimentosIngeridos = new ArrayList<>();
        } else {
            this.alimentosIngeridos = listaAlimentos;
        }

    }

    public String[] getArrayAlimentosIngeridos() {
        final String[] retorno = new String[this.getAlimentosIngeridos().size()];
        for (int i = 0; i < this.getAlimentosIngeridos().size(); ++i) {
            retorno[i] = this.getAlimentosIngeridos().get(i).toString();
        }
        return retorno;
    }
    
    public String[] getArrayRestricciones() {
        final String[] retorno = new String[this.getRestricciones().size()];
        for (int i = 0; i < this.getRestricciones().size(); ++i) {
            retorno[i] = this.getRestricciones().get(i);
        }
        return retorno;
    }
    
    public String[] getArrayPreferencias() {
        final String[] retorno = new String[this.getPreferencias().size()];
        for (int i = 0; i < this.getPreferencias().size(); ++i) {
            retorno[i] = this.getPreferencias().get(i);
        }
        return retorno;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public void actualizarPreferenciasUsuario(final Usuario usuario, final ArrayList<String> preferencias) {
        usuario.setPreferencias(preferencias);
    }
    
    public void actualizarRestriccionesUsuario(final Usuario usuario, final ArrayList<String> restricciones) {
        usuario.setRestricciones(restricciones);
    }
}
