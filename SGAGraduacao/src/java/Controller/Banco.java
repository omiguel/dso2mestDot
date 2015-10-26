/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.util.ArrayList;
import java.util.List;
import model.Aluno;

/**
 *
 * @author Robson
 */
public class Banco {
    
    private static List<Aluno> alunos = new ArrayList<>();
    private static Banco bd = new Banco();
    
    private Banco(){};

    public static List<Aluno> getAlunos() {
        return alunos;
    }
    
    public static Banco getInstance(){
        return Banco.bd;
    };
    
    public Aluno getByCpf(String cpf){
        Aluno ret = new Aluno();
        for(Aluno a : this.alunos){
            if(a.getCpf().equals(cpf)){
                ret = a;
            }
        }
        
        return ret;
    }
    
    public Boolean verificaSeCadastrado(Aluno aluno){
        for(Aluno a : this.alunos){
            if(a.getCpf().equals(aluno.getCpf())){
                return true;
            }
        }
        return false;
    }
    
    public String cadastraUsuario(Aluno aluno){
        System.out.println("no banco");
        System.out.println(aluno.getNome());
        if(this.verificaSeCadastrado(aluno)){
            return "alunoCadastrado";
        } else{
            this.alunos.add(aluno);
            return "index";
        }
    };
    
}
