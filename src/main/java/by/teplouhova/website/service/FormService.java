package by.teplouhova.website.service;

import by.teplouhova.website.model.Form;
import by.teplouhova.website.repository.FormRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

@Component
public class FormService {

    @Autowired
    private FormRepository formRepository;

    public void saveForm(Form form){
        formRepository.save(form);

    }

    public List<Form> findAll(){
        List<Form> forms=new ArrayList<>();
        Iterator<Form> iterator=formRepository.findAll().iterator();
        while(iterator.hasNext()){
            forms.add(iterator.next());
        }
        return  forms;
    }

    public Form findForm(long id){
        Optional<Form> form=formRepository.findById(id);
        return form.orElse(null);
    }
}

