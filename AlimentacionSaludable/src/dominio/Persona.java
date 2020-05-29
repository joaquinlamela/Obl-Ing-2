package dominio;

import java.util.Objects;
import java.io.Serializable;
import javax.swing.ImageIcon;

public abstract class Persona implements Serializable {

    private String nombre;
    private String apellido;
    private String fechaNacimiento;
    private ImageIcon fotoDePerfil;
    
    private static final String NOMBRENOINGRESADO= "Nombre no ingresado"; 

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String unNombre) {
        if (unNombre == null || unNombre.isEmpty()) {
            this.nombre = NOMBRENOINGRESADO;
        }
        else {
            this.nombre = unNombre;
        }
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String unApellido) {
        if (unApellido == null || unApellido.isEmpty()) {
            this.apellido = "Apellido no ingresado";
        } else {
            this.apellido = unApellido;
        }
    }

    public String getFechaNacimiento() {
        return this.fechaNacimiento;
    }

    public void setFechaNacimiento(String unaFecha) {
        if (unaFecha == null || unaFecha.isEmpty()) {
            this.fechaNacimiento = "Fecha no ingresada";
        } else {
            this.fechaNacimiento = unaFecha;
        }
    }

    public ImageIcon getFotoDePerfil() {
        return this.fotoDePerfil;
    }

    public void setFotoDePerfil(ImageIcon foto) {
        if (foto == null) {
            this.fotoDePerfil = new ImageIcon(getClass().getResource("/Imagenes/fotoDeUsuarioStandard.png"));
        } else {
            this.fotoDePerfil = foto;
        }
    }

    public String getNombreCompleto() {
        String retorno;
        if (getNombre().equals(NOMBRENOINGRESADO) && getApellido().equals("Apellido no ingresado")) {
            retorno = NOMBRENOINGRESADO;
        } else if (getNombre().equals(NOMBRENOINGRESADO)) {
            retorno = getApellido();
        } else if (getApellido().equals("Apellido no ingresado")) {
            retorno = getNombre();
        } else {
            retorno = getNombre() + " " + getApellido();
        }
        return retorno;
    }

    @Override
    public String toString() {
        return this.getNombreCompleto();
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==null){
            return false; 
        }else if (this.getClass() != obj.getClass()){
            return false; 
        }else{
        Persona otraPersona = (Persona) obj;
        return this.getNombreCompleto().equals(otraPersona.getNombreCompleto());    
        }
        
    }
    
    @Override
    public int hashCode() {
        int hash = 9;
        hash = 17 * hash + Objects.hashCode(this.getNombreCompleto());
        return hash;
    }
}
