/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.app;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author 1499754
 */
public class ProdutoPerecivel extends Produto {
    
    private static final double DESCONTO = 0.75;
    private static final int PRAZO = 7;
    private LocalDate validade;
    
    public ProdutoPerecivel(String desc, double precoCusto, double margemLucro, double desconto, int prazo, LocalDate validade){
        super(desc, precoCusto, margemLucro);
        if (validade.isBefore(LocalDate.now())){
            throw new IllegalArgumentException("Validade anterior ao dia de hoje");
        }else{
            this.validade = validade;
        }
    }
    
    @Override
    public double valorDeVenda(){
        int diasDeValidade = LocalDate.now().until(validade).getDays();
        if(diasDeValidade<PRAZO){
            return precoCusto * (1+margemLucro) * DESCONTO;
        }
        return precoCusto * (1+margemLucro);
    }
    
    @Override
    public String toString(){
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/mm/yyyy");
        String dados = super.toString();
        
        dados += "Inválido até " + formato.format(validade);
        return dados;
    }
    
}
