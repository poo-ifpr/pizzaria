/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpr.poo.pizzaria;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author everaldo
 */
public class Pedido {
    
    private String tamanho;
    private String tipoMassa;
    private List<String> coberturas;
    
    public Pedido(String tamanho, String tipoMassa, List<String> coberturas){
        this.tamanho = tamanho;
        this.tipoMassa = tipoMassa;
        this.coberturas = coberturas;
    }
    
    public Pedido(){
        coberturas = new ArrayList<String>();
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getTipoMassa() {
        return tipoMassa;
    }

    public void setTipoMassa(String tipoMassa) {
        this.tipoMassa = tipoMassa;
    }

    public List<String> getCoberturas() {
        return coberturas;
    }

    public void setCoberturas(List<String> coberturas) {
        this.coberturas = coberturas;
    }
    
    public void adicionarCobertura(String cobertura){
        coberturas.add(cobertura);
    }
    
    public void removerCobertura(String cobertura){
        coberturas.remove(cobertura);
    }

    @Override
    public String toString() {
        return "Pedido{" + "tamanho=" + tamanho + ", tipoMassa=" + tipoMassa + ", coberturas=" + coberturas + '}';
    }
    
    
}
