package com.sistema.blog.sistemablogspringbootapirest.dto;

import com.sun.istack.NotNull;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class ComentarioDTO {

    private Long id;
    @NotEmpty(message = "El nombre no debe estar vacio")
    private String nombre;
    @Email
    @NotEmpty(message = "El email no debe estar vacio")
    private String email;
    @NotEmpty
    @Size(min = 10, message = "El cuerpo del comentario debe tener almenos 10 carcateres")
    private String cuerpo;

    public ComentarioDTO() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }
}
