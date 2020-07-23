package com.inerxia.naiscut.facade.salon.dto;

import com.inerxia.naiscut.facade.empleado.dto.EmpleadoDto;

public class SedeDto {

    private Integer id;
    private String descripcion;
    private String ciudad;
    private String direccion;
    private String telefono;
    private char domicilio;
    private char principal;
    private char estadoSede;
    private EmpleadoDto administradorFk;
    private SalonDto salonFk;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
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

    public char getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(char domicilio) {
        this.domicilio = domicilio;
    }

    public char getPrincipal() {
        return principal;
    }

    public void setPrincipal(char principal) {
        this.principal = principal;
    }

    public char getEstadoSede() {
        return estadoSede;
    }

    public void setEstadoSede(char estadoSede) {
        this.estadoSede = estadoSede;
    }

    public EmpleadoDto getAdministradorFk() {
        return administradorFk;
    }

    public void setAdministradorFk(EmpleadoDto administradorFk) {
        this.administradorFk = administradorFk;
    }

    public SalonDto getSalonFk() {
        return salonFk;
    }

    public void setSalonFk(SalonDto salonFk) {
        this.salonFk = salonFk;
    }
}