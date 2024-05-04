package Registration_form.learn_reg.registration.controller;

import Registration_form.learn_reg.registration.model.t_user;
import Registration_form.learn_reg.registration.service.Registration_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Registrationcontroller {
    @Autowired
    private Registration_service r_service;

    @PostMapping("/registeruser")
    public t_user register_user(@RequestBody t_user user) throws Exception {
        String check_email = user.getEmail();
        System.out.println(check_email);
        if (check_email != null && !"".equals(check_email)) {
            t_user user_obj = r_service.fetch_user_by_email_address(check_email);
            if (user_obj != null) {
                throw new Exception("user with " + check_email + " is already exist");
            }
        }
        t_user user_obj = null;
        user_obj = r_service.save(user);
        return user_obj;
    }
    @PostMapping("/loginuser")
    public t_user login_user(@RequestBody t_user user) throws Exception {
        String check_email = user.getEmail();
        String check_pass = user.getPassword();
        t_user user_obj = null;
        if (check_email != null && check_pass != null) {
            user_obj = r_service.fetch_user_by_email_address_and_pasww(check_email, check_pass);
        }
        if(user_obj==null){
            throw new Exception("Email or password not match");
        }
        return user_obj;
    }


}
