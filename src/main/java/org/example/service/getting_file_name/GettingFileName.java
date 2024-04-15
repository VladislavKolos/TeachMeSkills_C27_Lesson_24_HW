package org.example.service.getting_file_name;

/**
 * Class contains static String method "getFileName" - method to get the file name to write
 * getting the values of the firstName, lastName and title tags
 * return value - file name generated based on tag values.
 */
public class GettingFileName {
    public static String getFileName() {
        String firstName = "William";
        String lastName = "Shakespeare";
        String title = "Sonnet_130";

        return firstName + "_" + lastName + "_" + title + ".txt";
    }
}
