package ud.binmonkey.prog3_proyecto_server.common;

public class User {
    private String birthdDate;
    private String displayName;
    private String email;
    private String gender;
    private char[] password;
    private Language preferredLanguage;
    private Role role;
    private String userName;

    public User(String birthdDate, String displayName, String email, String gender, char[] password,
                Language preferredLanguage, Role role, String userName) {
        this.birthdDate = birthdDate;
        this.displayName = displayName;
        this.email = email;
        this.gender = gender;
        this.password = password;
        this.preferredLanguage = preferredLanguage;
        this.role = role;
        this.userName = userName;
    }

    public String getBirthdDate() {
        return birthdDate;
    }

    public void setBirthdDate(String birthdDate) {
        this.birthdDate = birthdDate;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public char[] getPassword() {
        return password;
    }

    public void setPassword(char[] password) {
        this.password = password;
    }

    public Language getPreferredLanguage() {
        return preferredLanguage;
    }

    public void setPreferredLanguage(Language preferredLanguage) {
        this.preferredLanguage = preferredLanguage;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
