package page_objects.test_data;

public interface StaticData {
    //TestData test case #2
    String correctEmail = "user@user.user.use";
    String correctPassword = "password43271234";

    //TestData test case #3
    String incorrectEmail = "sebastianmina654@gmail.com";
    String incorrectPassword = "password";

    //TestData test case #4
    String logoutEmail = "user@test.user";
    String logoutPassword = "user@test.user";

    //TestData test case #5
    String name = "test1";
    String existingEmail = "user@test.user";

    /**
     * Return an email
     * @return Email
     */
    static String getCorrectEmail(){

        return correctEmail;
    }

    /**
     * Return a password
     * @return Password
     */
    static String getCorrectPassword(){

        return correctPassword;
    }

    /**
     * Return an email
     * @return Email
     */
    static String getIncorrectEmail(){

        return incorrectEmail;
    }

    /**
     * Return a password
     * @return Password
     */
    static String geIncorrectPassword(){

        return incorrectPassword;
    }

    /**
     * Return an email
     * @return Email
     */
    static String getLogoutEmail(){

        return logoutEmail;
    }

    /**
     * Return a password
     * @return Password
     */
    static String getLogoutPassword(){

        return logoutPassword;
    }

    /**
     * Return a name
     * @return Name
     */
    static String getName(){

        return name;
    }

     /**
     * Return an email
     * @return Email
     */
    static String getExistingEmail(){

        return existingEmail;
    }

}
