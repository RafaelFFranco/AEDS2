/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.app;

/**
 *
 * @author 1499754
 */
public class ProdutoNaoPerecivel extends Produto {
    
    public ProdutoNaoPerecivel(String desc, double precoCusto, double margemLucro) {
        super(desc, precoCusto, margemLucro);
    }
    
    public ProdutoNaoPerecivel(String desc, double precoCusto){
        super(desc,precoCusto);
    }
    
    
   @Override
    public double valorDeVenda(){
        return precoCusto * (1+margemLucro);
    }
    
    
}
