package dominio;

import java.io.Serializable;
import java.util.Objects;
import java.util.Currency;

public final class PlanAlimentacion implements Serializable {

    private String nombreDelPlan;
    private Usuario usuario;
    private Profesional profesional;
    private boolean fueAtendidoElPlan;
    private String[][] planDiaADia;

    public PlanAlimentacion(String unNombreDelPlan, Usuario unUsuario, Profesional unProfesional, boolean fueAtendido, String[][] unPlan) {
        this.setNombreDelPlan(unNombreDelPlan);
        this.setUsuario(unUsuario);
        this.setProfesional(unProfesional);
        this.setFueAtendidoElPlan(fueAtendido);
        this.setPlanDiaADia(unPlan);
    }

    public Persona getUsuario() {
        return this.usuario;
    }

    public void setUsuario(Usuario unUsuario) {
        if (unUsuario == null) {
            this.usuario = new Usuario(null, null, null, null, null, null, null, null);
        }
        else {
            this.usuario = unUsuario;
        }
    }

    public Profesional getProfesional() {
        return this.profesional;
    }

    public void setProfesional(Profesional unProfesional) {
        if (unProfesional == null) {
            this.profesional = new Profesional(null, null, null, null, null, null, null);
        } else {
            this.profesional = unProfesional;
        }
    }

    public boolean getFueAtendidoElPlan() {
        return fueAtendidoElPlan;
    }

    public void setFueAtendidoElPlan(boolean fueAtendido) {
        this.fueAtendidoElPlan = fueAtendido;
    }

    public String[][] getPlanDiaADia() {
        return this.planDiaADia;
    }

    public void setPlanDiaADia(String[][] unPlan) {
        if (unPlan == null) {
            this.planDiaADia = new String[0][0];
        }
        else {
            this.planDiaADia = unPlan;
        }
    }

    public String getNombreDelPlan() {
        return this.nombreDelPlan;
    }

    public void setNombreDelPlan(String unNombreDelPlan) {
        if (unNombreDelPlan == null || unNombreDelPlan.isEmpty()) {
            this.nombreDelPlan = "Plan de alimentaci\u00f3n";
        }
        else {
            this.nombreDelPlan = unNombreDelPlan;
        } 
    }

    @Override
    public String toString() {
        return this.getNombreDelPlan();
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==null){
            return false; 
        }else if (this.getClass() != obj.getClass()){
            return false; 
        }else{
        PlanAlimentacion otroPlanAlimentacion = (PlanAlimentacion) obj;
        return (this.getNombreDelPlan().equals(otroPlanAlimentacion.getNombreDelPlan())
                && this.getUsuario().equals(otroPlanAlimentacion.getUsuario())
                && this.getProfesional().equals(otroPlanAlimentacion.getProfesional()));
        }
       
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.usuario);
        return hash;
    }

}
