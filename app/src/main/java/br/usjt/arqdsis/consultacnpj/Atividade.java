package br.usjt.arqdsis.consultacnpj;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Leandro Reverso
 */

public class Atividade  implements Serializable{

    @SerializedName("code")
    private String code;
    @SerializedName("text")
    private String text;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
