package com.example.demo;

public class Exercicioenum {


    public enum Ufbrasil {

    

    AC("AC", 1, "Acre"),
    AL("AL", 2, "Alagoas"),
    AP("AP", 3, "Amapá"),
    AM("AM", 4, "Amazonas"),
    BA("BA", 5, "Bahia"),
    CE("CE", 6, "Ceará"),
    DF("DF", 7, "Distrito Federal"),
    ES("ES", 8, "Espírito Santo"),
    GO("GO", 9, "Goiás"),
    MA("MA", 10, "Maranhão"),
    MT("MT", 11, "Mato Grosso"),
    MS("MS", 12, "Mato Grosso do Sul"),
    MG("MG", 13, "Minas Gerais"),
    PA("PA", 14, "Pará"),
    PB("PB", 15, "Paraíba"),
    PR("PR", 16, "Paraná"),
    PE("PE", 17, "Pernambuco"),
    PI("PI", 18, "Piauí"),
    RJ("RJ", 19, "Rio de Janeiro"),
    RN("RN", 20, "Rio Grande do Norte"),
    RS("RS", 21, "Rio Grande do Sul"),
    RO("RO", 22, "Rondônia"),
    RR("RR", 23, "Roraima"),
    SC("SC", 24, "Santa Catarina"),
    SP("SP", 25, "São Paulo"),
    SE("SE", 26, "Sergipe"),
    TO("TO", 27, "Tocantins");
      
    private final String uf;
    private final int id;
    private final String nome;

    
    Ufbrasil(String uf, int id, String nome){
        
        this.uf = uf;
        this.id = id;
        this.nome = nome;
        
    }
    
    public String getUf() {
        return uf;
    }
    
    public int getId() {
        return id;
    }
    
    public String getNome() {
        return nome;
    }
    
}


public enum Regiao {

    NORTE("Norte"),
    NORDESTE("Nordeste"),
    CENTRO_OESTE("Centro-Oeste"),
    SUDESTE("Sudeste"),
    SUL("Sul");

    private final String nome;

    Regiao (String nome){
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }
    

}


}