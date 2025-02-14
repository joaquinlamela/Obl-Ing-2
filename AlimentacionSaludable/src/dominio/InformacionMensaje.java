package dominio;

import java.io.Serializable;
        
public final class InformacionMensaje implements Serializable {

    private String mensaje;
    private String destinatario;
    private String remitente;

    public InformacionMensaje(String elRemitente, String dst, String elMensaje) {
        setRemitente(elRemitente);
        setDestinatario(dst);
        setMensaje(elMensaje);
    }

    public String getMensaje() {
        return this.mensaje;
    }

    public void setMensaje(String elMensaje) {
        this.mensaje = elMensaje;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String elDestinatario) {
        if (elDestinatario == null || elDestinatario.isEmpty()) {
            this.destinatario = "Destinatario no ingresado";
        } else {
            this.destinatario = elDestinatario;
        }
    }

    public String getRemitente() {
        return remitente;
    }

    public void setRemitente(String elRemitente) {
        if (elRemitente == null || elRemitente.isEmpty()) {
            this.remitente = "Remitente no ingresado";
        } else {
            this.remitente = elRemitente;
        }
    }

    public void intercambiarRemitente() {
        String aux = destinatario;
        destinatario = remitente;
        remitente = aux;
    }

    @Override
    public String toString() {
        return getRemitente() + ": \n" + getMensaje();
    }

}
