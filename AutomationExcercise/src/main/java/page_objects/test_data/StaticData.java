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

    //TestData test case #9
    String productName = "Top";

    //TestData test case #13
    String quantity = "4";

    //TestData test case 23
    String firstName = TestDataGenerator.newFirstName();
    String lastName = TestDataGenerator.newLastName();
    String company = TestDataGenerator.newCompany();
    String address = TestDataGenerator.newAddress();
    String address2 = TestDataGenerator.newAddress();
    String country = TestDataGenerator.newCountry();
    String state = TestDataGenerator.newState();
    String city = TestDataGenerator.newCity();
    String zipCode = TestDataGenerator.newZipCode();
    String mobileNumber = TestDataGenerator.newMobileNumber();

}
