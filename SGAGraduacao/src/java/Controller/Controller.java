/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import javax.faces.bean.ManagedBean;
import model.Aluno;
import model.Artigo;
import model.Estagio;

/**
 *
 * @author Robson
 */
@ManagedBean
public class Controller {

    Aluno aluno = new Aluno();
    Artigo artigo = new Artigo();
    Estagio estagio = new Estagio();
    String cpf;
    Banco bd = Banco.getInstance();

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Artigo getArtigo() {
        return artigo;
    }

    public void setArtigo(Artigo artigo) {
        this.artigo = artigo;
    }

    public Estagio getEstagio() {
        return estagio;
    }

    public void setEstagio(Estagio estagio) {
        this.estagio = estagio;
    }
    
    public String cadastraUsuario(){
        String nextView = this.bd.cadastraUsuario(aluno);
        System.out.println("no controller");
        System.out.println(this.aluno.getNome());
        return nextView;
    }
    
    public void getAlunoByCpf(){
        Aluno a = new Aluno();
        a = bd.getByCpf(this.cpf);
        System.out.println("retornou isso ");
        System.out.println(a.getNome());
        System.out.println(a.getCpf());
    }

}
