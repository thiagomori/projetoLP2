/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetosociotorcedor;

import com.br.lp2.model.Assento;
import com.br.lp2.model.Usuario;
import com.br.lp2.model.Jogo;
import com.br.lp2.model.Estadio;
import com.br.lp2.model.Ingresso;
import com.br.lp2.model.dao.AssentoDAO;
import com.br.lp2.model.dao.EstadioDAO;
import com.br.lp2.model.dao.IngressoDAO;
import com.br.lp2.model.dao.UsuarioDAO;
import com.br.lp2.model.dao.JogoDAO;
import java.util.List;

/**
 *
 * @author Everson
 */
public class ProjetoSocioTorcedor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        UsuarioDAO usuarioDAO = new UsuarioDAO();
        JogoDAO jogoDAO = new JogoDAO();
        IngressoDAO ingressoDAO = new IngressoDAO();
        EstadioDAO estadioDAO = new EstadioDAO();
        AssentoDAO assentoDAO = new AssentoDAO();

        //LEITURA DO ESTADO INICIAL DO BANCO
        List<Usuario> lista = usuarioDAO.read();
        for (Usuario usuario : lista) {
          System.out.println(usuario);
        }

        List<Jogo> lista1 = jogoDAO.read();
        for (Jogo jogo : lista1) {
            System.out.println(jogo);
        }

        List<Ingresso> lista2 = ingressoDAO.read();
        for (Ingresso ingresso : lista2) {
            System.out.println(ingresso);
        }

        List<Estadio> lista3 = estadioDAO.read();
        for (Estadio estadio : lista3) {
            System.out.println(estadio);
        }

        List<Assento> lista4 = assentoDAO.read();
        for (Assento assento : lista4) {
            System.out.println(assento);
        }

        //========================================================================
        
        //USUARIODAO
        
        System.out.println("-----------------");

        Usuario u1 = new Usuario();
        u1.setSenha("987");
        u1.setUsername("Carlos");
        //usuarioDAO.insert(u1);

        //ATUALIZA USUARIO
        //Usuario u2 = lista.get(lista.size() - 1);
        //u2.setUsername("Joel");
        //u2.setSenha("321");
        //usuarioDAO.update(u2);

        //REMOVE USUARIO
        //Usuario u3 = lista.get(lista.size() - 1);
        //usuarioDAO.delete(u3);

        //REMOVE USARIO ESPECIFICO
        Usuario u4 = new Usuario();
        for (Usuario usuario : lista) {
            if (usuario.getUsername().equals("Dilma")) {
                u4 = usuario;
                break;
            }
        }
        //usuarioDAO.delete(u4);

        //========================================================================
        
        //JOGODAO
        
        Jogo j1 = new Jogo();
        j1.setId_Estadio(8);
        j1.setTime1("Palmeiras");
        j1.setTime2("São Paulo");
        //jogoDAO.insert(j1);

        //ATUALIZA JOGO
        Jogo j2 = lista1.get(lista1.size() - 1);
        j2.setTime1("COR");
        j2.setTime2("Santos");
        //jogoDAO.update(j2);

        //REMOVE JOGO
        //Jogo j3 = lista1.get(lista1.size() - 1);
        //jogoDAO.delete(j3);

        //REMOVE JOGO ESPECIFICO
        Jogo j4 = new Jogo();
        for (Jogo jogo : lista1) {
            if (jogo.getTime1().equals("Palmeiras") || jogo.getTime2().equals("Palmeiras")) {
                j4 = jogo;
                break;
            }
        }
        //jogoDAO.delete(j4);

        //========================================================================
        
        //INGRESSO
        
        Ingresso i1 = new Ingresso();
        i1.setNumeroIngresso(1);
        i1.setValorIngresso(10.00);
        //i1.setData(10/14/2015);
        //i1.setHora(00:42);
        i1.setNomeCampeonato("Campeonato Brasileiro");
        //ingressoDAO.insert(i1);

        //ATUALIZA INGRESSO
      //  Ingresso i2 = lista2.get(lista2.size() - 1);
        //ingressoDAO.update(i2);

        //REMOVE INGRESSO
        //Ingresso i3 = lista2.get(lista2.size() - 1);
        //ingressoDAO.delete(i3);

        //REMOVE INGRESSO ESPECIFICO
        Ingresso i4 = new Ingresso();
        for (Ingresso ingresso : lista2) {
            //if ()) {
                //i4 = jogo;
                break;
            }
        //ingressoDAO.delete(i4);

        //========================================================================
        
        //ESTADIODAO

        Estadio es1 = new Estadio();
        es1.setLocalizacao("Itaquera");
        es1.setNomeEstadio("Arena");
        es1.setCapacidadeEstadio(10000);
        //estadioDAO.insert(es1);

        //ATUALIZA ESTADIO
        //Estadio es2 = lista3.get(lista3.size() - 1);
        //es2.setLocalizacao("Rio de Janeiro");
        //es2.setNomeEstadio("Maracanã");
        //es2.setCapacidadeEstadio(9000);
        //estadioDAO.update(es2);

        //REMOVE ESTADIO
        //Estadio es3 = lista3.get(lista3.size() - 1);
        //estadioDAO.delete(es3);

        //REMOVE ESTADIO ESPECIFICO
        for(int i=0; i < lista3.size(); i++){    
            if (lista3.get(i).getNomeEstadio().equals("Arena")) {
                //estadioDAO.delete(lista3.get(i));
                break;
            }
        }

        //========================================================================
        
        //ASSENTODAO
        Assento a1 = new Assento();
        a1.setNumeroAssento(53);
        a1.setSetorAssento("Amarelo");
        //assentoDAO.insert(a1);

        //ATUALIZA ASSENTO
        //Assento a2 = lista4.get(lista4.size() - 1);
        //a2.setNumeroAssento(100);
        //a2.setSetorAssento("Azul");
        //assentoDAO.update(a2);

        //REMOVE ASSENTO
        //Assento a3 = lista4.get(lista4.size() - 1);
        //assentoDAO.delete(a3);

        //REMOVE ASSENTO ESPECIFICO
        Assento a4 = new Assento();
        for (Assento assento : lista4) {
            if (assento.getNumeroAssento() == 53 && assento.getSetorAssento().equals("Amarelo")) {
                a4 = assento;
                break;
            }
        }
        //assentoDAO.delete(a4);

        //========================================================================
        
        lista = usuarioDAO.read();
        for (Usuario usuario : lista) {
            System.out.println(usuario);
        }

        lista1 = jogoDAO.read();
        for (Jogo jogo : lista1) {
            System.out.println(jogo);
        }

        lista2 = ingressoDAO.read();
        for (Ingresso ingresso : lista2) {
            System.out.println(ingresso);
        }

        lista3 = estadioDAO.read();
        for (Estadio estadio : lista3) {
            System.out.println(estadio);
        }

        lista4 = assentoDAO.read();
        for (Assento assento : lista4) {
            System.out.println(assento);
        }

    }
}
