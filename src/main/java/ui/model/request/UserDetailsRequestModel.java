package ui.model.request;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class UserDetailsRequestModel {
    @NotNull(message = "First Name Cannot be Null")
    @Size(min=2,message = "First name must be at least 2 chars")
    private String firstName;
    @NotNull(message = "Last Name Cannot be Null")
    @Size(min=2,message = "Last name must be at least 2 chars")
    private String lastName;
    @NotNull(message = "Email Cannot be Null")
    @Email
    private String email;
    @NotNull(message = "Password Cannot be Null")
    @Size(min=8,max=16,message = "Password must be between 8 and 16 chars long")
    private String password;
}
