package app.spring_project.user.beans;

import lombok.Data;

@Data
public class UserBean {
    private int id;
    private String name;
    private String email;
    private String password;
}
