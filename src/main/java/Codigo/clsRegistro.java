
package Codigo;
public class clsRegistro {

private String strName;
private String strApellido;
private String strContacto;
private String strcorreo;
private int intEdad;
private String strSexo;
private String strBarrio;
private String strAfectacion;
private int intCantHabitantes;
private String id;

    public clsRegistro(String strName, String strApellido, String strContacto, String strcorreo, int intEdad, String strSexo, String strBarrio, String strAfectacion, int intCantHabitantes, String id) {
        this.strName = strName;
        this.strApellido = strApellido;
        this.strContacto = strContacto;
        this.strcorreo = strcorreo;
        this.intEdad = intEdad;
        this.strSexo = strSexo;
        this.strBarrio = strBarrio;
        this.strAfectacion = strAfectacion;
        this.intCantHabitantes = intCantHabitantes;
        this.id = id;
    }

    public String getStrName() {
        return strName;
    }

    public void setStrName(String strName) {
        this.strName = strName;
    }

    public String getStrApellido() {
        return strApellido;
    }

    public void setStrApellido(String strApellido) {
        this.strApellido = strApellido;
    }

    public String getStrContacto() {
        return strContacto;
    }

    public void setStrContacto(String strContacto) {
        this.strContacto = strContacto;
    }

    public String getStrcorreo() {
        return strcorreo;
    }

    public void setStrcorreo(String strcorreo) {
        this.strcorreo = strcorreo;
    }

    public int getIntEdad() {
        return intEdad;
    }

    public void setIntEdad(int intEdad) {
        this.intEdad = intEdad;
    }

    public String getStrSexo() {
        return strSexo;
    }

    public void setStrSexo(String strSexo) {
        this.strSexo = strSexo;
    }

    public String getStrBarrio() {
        return strBarrio;
    }

    public void setStrBarrio(String strBarrio) {
        this.strBarrio = strBarrio;
    }

    public String getStrAfectacion() {
        return strAfectacion;
    }

    public void setStrAfectacion(String strAfectacion) {
        this.strAfectacion = strAfectacion;
    }

    public int getIntCantHabitantes() {
        return intCantHabitantes;
    }

    public void setIntCantHabitantes(int intCantHabitantes) {
        this.intCantHabitantes = intCantHabitantes;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


}
