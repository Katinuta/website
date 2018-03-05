package by.teplouhova.website.model;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "form")
public class Form implements Serializable {
    @Id
    @Column(name = "f_form_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long formId;

    @Column(name = "f_script", nullable = false)
    private String formScript;

    @Column(name = "f_name", nullable = false)
    private String name;


    public Form() {
    }

    public Form(String formScript, String name) {
        this.formScript = formScript;
        this.name = name;
    }

    public Long getFormId() {
        return formId;
    }

    public String getFormScript() {
        return formScript;
    }

    public String getName() {
        return name;
    }

    public void setFormId(Long formId) {
        this.formId = formId;
    }

    public void setFormScript(String formScript) {
        this.formScript = formScript;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Form{" +
                "formId=" + formId +
                ", formScript='" + formScript + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
