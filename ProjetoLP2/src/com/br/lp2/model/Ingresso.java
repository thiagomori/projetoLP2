/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.lp2.model;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;

/**

 * @author Everson
 */
public class Ingresso implements Serializable{
    
    private int id_ingresso, numeroIngresso;
    private double valorIngresso;
    private Date dia;
    private Time hora;
    private String nomeCampeonato;
    
    //-----------------------------------CONSTRUTORES---------------------------------------------
    
    public Ingresso() {
        this.id_ingresso = -1;
        this.numeroIngresso = -1;
        this.valorIngresso = 00.00;
        this.dia = Date.valueOf(LocalDate.MIN);
        this.hora = Time.valueOf(LocalTime.MIN);
        this.nomeCampeonato = "Campeonato";
    }

    public Ingresso(int numeroIngresso, double valorIngresso, Date dia, Time hora, String nomeCampeonato) {
        this.id_ingresso = -1;
        this.numeroIngresso = numeroIngresso;
        this.valorIngresso = valorIngresso;
        this.dia = dia;
        this.hora =hora;
        this.nomeCampeonato = nomeCampeonato;
    }

    public Ingresso(int id_ingresso, int numeroIngresso, double valorIngresso, Date dia, Time hora, String nomeCampeonato) {
        this.id_ingresso = id_ingresso;
        this.numeroIngresso = numeroIngresso;
        this.valorIngresso = valorIngresso;
        this.dia = dia;
        this.hora =hora;
        this.nomeCampeonato = nomeCampeonato;
    }
    
    //----------------------------------------------GETTER E SETTER-----------------------------------------------------------------------
    
    public int getId_ingresso() {
        return id_ingresso;
    }

    public void setId_ingresso(int id_ingresso) {
        this.id_ingresso = id_ingresso;
    }

    public int getNumeroIngresso() {
        return numeroIngresso;
    }

    public void setNumeroIngresso(int numeroIngresso) {
        this.numeroIngresso = numeroIngresso;
    }

    public double getValorIngresso() {
        return valorIngresso;
    }

    public void setValorIngresso(double valorIngresso) {
        this.valorIngresso = valorIngresso;
    }

    public Date getData() {
        return dia;
    }

    public void setData(Date dia) {
        this.dia = dia;
    }

    public Time getHora() {
        return hora;
    }

    public void setHora(Time hora) {
        this.hora = hora;
    }

    public String getNomeCampeonato() {
        return nomeCampeonato;
    }

    public void setNomeCampeonato(String nomeCampeonato) {
        this.nomeCampeonato = nomeCampeonato;
    }
    
     //------------------------------------------------TOSTRING---------------------------------------------------------------------------

    @Override
    public String toString() {
        return "Ingresso{" + "id_ingresso=" + id_ingresso + ", numeroIngresso=" + numeroIngresso + ", valorIngresso=" + valorIngresso + ", dia=" + dia + ", hora=" + hora + ", nomeCampeonato=" + nomeCampeonato + '}';
    }

    


}
