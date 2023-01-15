package com.portfolio.mfc.Dto;

import javax.validation.constraints.NotBlank;


public class DtoExperiencia {
    @NotBlank
    private String NombreE;
    @NotBlank
    private String descripcionE;
    @NotBlank
    private String tecnologias;

    public DtoExperiencia() {
    }

    public DtoExperiencia(String NombreE, String descripcionE, String tecnologias) {
        this.NombreE = NombreE;
        this.descripcionE = descripcionE;
        this.tecnologias = tecnologias;
    }

    public String getNombreE() {
        return NombreE;
    }

    public void setNombreE(String NombreE) {
        this.NombreE = NombreE;
    }

    public String getDescripcionE() {
        return descripcionE;
    }

    public void setDescripcionE(String descripcionE) {
        this.descripcionE = descripcionE;
    }

    public String getTecnologias() {
        return tecnologias;
    }

    public void setTecnologias(String tecnologias) {
        this.tecnologias = tecnologias;
    }
    
    
}
