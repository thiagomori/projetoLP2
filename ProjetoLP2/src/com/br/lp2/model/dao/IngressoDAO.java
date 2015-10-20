/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.lp2.model.dao;

import com.br.lp2.model.Ingresso;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Everson
 */
public class IngressoDAO implements GenericDAO<Ingresso>{
        
        private Connection con;
    
    //==================================INSERIR NA TABELA================================================

    @Override
    public boolean insert(Ingresso ingresso) {
        
        boolean resposta = false;
        
        con = ConnectionFactory.getConnection();
        
        String sql = "INSERT INTO ingresso(numeroIngresso, valorIngresso, data, hora, nomeCampeonato) VALUES (?,?,?,?,?)";
        
        try{
            
        Ingresso i = new Ingresso();    
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, ingresso.getNumeroIngresso());
        ps.setDouble(2, ingresso.getValorIngresso());
        ps.setDate(3, ingresso.getData());
        ps.setTime(4, ingresso.getHora());
        ps.setString(5, ingresso.getNomeCampeonato());
        
        
        int resp = ps.executeUpdate();
        
        if(resp > 0){
            resposta = true;
        }        
        
        ps.close();
        con.close();
        
        }catch(SQLException ex){
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return resposta;
        
    }

    @Override
    public List<Ingresso> read() {

    List<Ingresso> ingressos = new ArrayList<>();
        
        con = ConnectionFactory.getConnection();
        
        String sql = "SELECT * FROM ingresso";
        
        try{
            
            PreparedStatement ps = con.prepareStatement(sql);
            
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                int id = rs.getInt("id_ingresso");
                int numeroIngresso = rs.getInt("numeroIngresso");
                double valorIngresso = rs.getDouble("valorIngresso");
                Date data = (Date) rs.getDate("data");
                Time hora = (Time) rs.getTime("hora");
                String nomeCampeonato = rs.getString("nomeCampeonato");
                Ingresso i = new Ingresso(id, numeroIngresso, valorIngresso, data, hora, nomeCampeonato);
                ingressos.add(i);
            }
            
            ps.close();
            rs.close();
            con.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       return ingressos;

    }

    @Override
    public boolean update(Ingresso ingresso) {
        
        boolean resposta = false;
        
        con = ConnectionFactory.getConnection();
        
        String sql = "UPDATE ingresso SET numeroIngresso = ?, valorIngresso = ?, data = ?, hora = ?, nomeCampeonato = ? WHERE id_ingresso = ?";
        
        try{
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, ingresso.getNumeroIngresso());
            ps.setDouble(2, ingresso.getValorIngresso());
            ps.setDate(3, ingresso.getData());
            ps.setTime(4, ingresso.getHora());
            ps.setString(5, ingresso.getNomeCampeonato());
            ps.setInt(6, ingresso.getId_ingresso());
            
           int resp = ps.executeUpdate();
           
           if(resp > 0){
               resposta = true;
           }
           
           ps.close();
           con.close();
           
        }catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return resposta;

        
    }

    @Override
    public boolean delete(Ingresso ingresso) {
    
    boolean resposta = false;
        
        con = ConnectionFactory.getConnection();
        
        String sql = "DELETE FROM ingresso WHERE id_ingresso = ?";
        
        try{
        
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, ingresso.getId_ingresso());
            
            int resp = ps.executeUpdate();
            
            if(resp > 0){
                resposta = true;
            }
            
            ps.close();
            con.close();
            
        }catch(SQLException ex){
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return resposta;


    }
    
}
