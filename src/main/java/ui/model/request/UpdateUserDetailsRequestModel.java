package ui.model.request;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class UpdateUserDetailsRequestModel {
    @NotNull(message = "First Name Cannot be Null")
    @Size(min=2,message = "First name must be at least 2 chars")
    private String firstName;
    @NotNull(message = "Last Name Cannot be Null")
    @Size(min=2,message = "Last name must be at least 2 chars")
    private String lastName;
}
