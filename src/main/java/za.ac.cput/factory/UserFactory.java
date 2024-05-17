package za.ac.cput.factory;

import za.ac.cput.domain.User;
import za.ac.cput.util.Helper;

public class UserFactory {
    public static User buildUser(String userID, String firstName, String lastName,
                                     String password, String email, String addressID){
        if (Helper.isNullOrEmpty(userID) || Helper.isNullOrEmpty(firstName) || Helper.isNullOrEmpty(lastName) || Helper.isNullOrEmpty(password)
        ||  Helper.isNullOrEmpty(addressID))
              return null;

        if(!Helper.isEmailValid(email) || Helper.isNullOrEmpty(email)) return null;

        return new User.Builder().setUserID(userID).setFirstName(firstName).setLastName(lastName)
                .setEmail(email).setPassword(password).setAddressID(addressID)
                .build();
    }



}
