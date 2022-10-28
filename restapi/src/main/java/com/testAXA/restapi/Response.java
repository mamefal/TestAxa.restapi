package com.testAXA.restapi;
public class Response {

    private Integer resultat;

    public Response(Integer resultat) {
        this.resultat = resultat;
    }

    public Integer getResultat() {
        return resultat;
    }

    public void setResultat(Integer resultat) {
        this.resultat = resultat;
    }
}