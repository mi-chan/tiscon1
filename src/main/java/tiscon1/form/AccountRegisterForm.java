package tiscon1.form;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.Email;
import java.io.Serializable;

/**
 * @author kawasima
 */
@Data
public class AccountRegisterForm implements Serializable {
    @Size(min = 1, max = 20)
    @NotEmpty
    private String name;

    @Email
    @NotEmpty
    private String email;
    @Size(min = 8, max=18)
    @NotEmpty
    private String password;
}
