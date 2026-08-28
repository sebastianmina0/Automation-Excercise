package page_objects.test_data;


import com.github.javafaker.Faker;

/**
 * Interface to generate random data
 * TestDataGenerator
 */
public interface TestDataGenerator {

    static final Faker faker = new Faker();

    /**
     * Random username
     * @return Username
     */
    static String newUserName(){

        return faker.name().username();
    }

    /**
     * Random Firstname
     * @return Firstname
     */
    static String newFirstName(){

        return faker.name().firstName();
    }

    /**
     * Random email
     * @return Email
     */
    static String newEmail(){

        return faker.internet().emailAddress();
    }

    /**
     * Random passowrd
     * @return Password
     */
    static String newPassword(){

        return faker.internet().password(6,8);
    }

    /**
     * Return a number between 1-31
     * @return String
     */
    static String newDay(){

        return faker.random().nextInt(1, 31).toString();

    }

    /**
     * Return a number between 1-12
     * @return Strng
     */
    static String newMonth(){

        return faker.random().nextInt(1, 12).toString();
    }

    /**
     * Return a number between 1900 - 2021
     * @return String
     */
    static String newYear(){

        return faker.random().nextInt(1900, 2021).toString();
    }

    /**
     * Return a lastname
     * @return Lastname
     */
    static String newLastName(){

        return faker.name().lastName();
    }

    /**
     * Return a company name
     * @return Name
     */
    static String newCompany(){

        return faker.company().name();
    }

    /**
     * Return a Address
     * @return Address
     */
    static String newAddress(){

        return faker.address().fullAddress();
    }

    /**
     * Return a country
     * @return String
     */
    static String newCountry(){

        return faker.options().option("India", "United States", "Canada", "Australia", "Israel",
        "New Zealand", "Singapore");
    }

    /**
     * Return a city name
     * @return city name
     */
    static String newCity(){

        return faker.address().cityName();
    }

    /**
     * Return a state
     * @return State
     */
    static String newState(){

        return faker.address().state();
    }

    /**
     * Return a zipcode
     * @return Zipcode
     */
    static String newZipCode(){

        return faker.address().zipCode();
    }

    /**
     * Return a mobile phone number
     * @return String
     */
    static String newMobileNumber(){

        return faker.phoneNumber().toString();
    }
}




