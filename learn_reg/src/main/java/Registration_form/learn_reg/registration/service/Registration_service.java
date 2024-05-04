package Registration_form.learn_reg.registration.service;

import Registration_form.learn_reg.registration.model.t_user;
import Registration_form.learn_reg.registration.repository.Registration_repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Registration_service {
    @Autowired
    private Registration_repository repos;

    public t_user save(t_user user) {
        return repos.save(user);
    }

    public t_user fetch_user_by_email_address(String email) {

        return repos.findByemail(email);
    }
    public t_user fetch_user_by_email_address_and_pasww(String email,String password) {

        return repos.findByEmailAndPassword(email,password);
    }
}
