package Registration_form.learn_reg.registration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import Registration_form.learn_reg.registration.model.t_user;

public interface Registration_repository extends JpaRepository<t_user, Long> {

    t_user findByemail(String email);

    t_user findByEmailAndPassword(String email, String password);

}
