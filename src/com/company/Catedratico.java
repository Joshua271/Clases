package com.company;

public class Catedratico {

    private String catedratico;
    private String tel_Catedratico;
    private String correo;

    public Catedratico(String catedratico) {
        this.catedratico = catedratico;
    }

    public String getTel_Catedratico() {
        return tel_Catedratico;
    }

    public void setTel_Catedratico(String tel_Catedratico) {
        this.tel_Catedratico = tel_Catedratico;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCatedratico() {
        return catedratico;
    }
}
