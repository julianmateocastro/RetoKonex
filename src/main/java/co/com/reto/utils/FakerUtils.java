package co.com.reto.utils;

import com.github.javafaker.Faker;

public class FakerUtils {


    private static final Faker faker = new Faker();

    public static String generateRandomPassword() {
        return faker.internet().password();
    }

    public static String generateRandomUsername() {
        return faker.name().username();
    }

    public static String generateRandomEmail() {
        return faker.internet().emailAddress();
    }


}
