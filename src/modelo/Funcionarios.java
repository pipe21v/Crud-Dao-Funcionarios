/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Luis Felipe
 */
public class Funcionarios {
    
    int codFuncionario;
    String tipoIdentificacion;
    int numeroIdentificacion;
    String nombre;
    String apellido;
    String estadoCivil;
    String sexo;
    String direccion;
    String telefono;
    String fechaNacimiento;
    int codFormacion;
    int codGrupoFamiliar;
    
    public Funcionarios(){
        
    }

    public Funcionarios(int codFuncionario, String tipoIdentificacion, int numeroIdentificacion, String nombre, String apellido, String estadoCivil, String sexo, String direccion, String telefono, String fechaNacimiento, int codFormacion, int codGrupoFamiliar) {
        this.codFuncionario = codFuncionario;
        this.tipoIdentificacion = tipoIdentificacion;
        this.numeroIdentificacion = numeroIdentificacion;
        this.nombre = nombre;
        this.apellido = apellido;
        this.estadoCivil = estadoCivil;
        this.sexo = sexo;
        this.direccion = direccion;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
        this.codFormacion = codFormacion;
        this.codGrupoFamiliar = codGrupoFamiliar;
    }

    public Funcionarios(int parseInt, String text, int parseInt0, String text0, String text1, String text2, String text3, String text4, String text5, String text6) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getCodFuncionario() {
        return codFuncionario;
    }

    public void setCodFuncionario(int codFuncionario) {
        this.codFuncionario = codFuncionario;
    }

    public String getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public void setTipoIdentificacion(String tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }

    public int getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public void setNumeroIdentificacion(int numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getCodFormacion() {
        return codFormacion;
    }

    public void setCodFormacion(int codFormacion) {
        this.codFormacion = codFormacion;
    }

    public int getCodGrupoFamiliar() {
        return codGrupoFamiliar;
    }

    public void setCodGrupoFamiliar(int codGrupoFamiliar) {
        this.codGrupoFamiliar = codGrupoFamiliar;
    }
    
    
    
    
}


