package com.pastdue.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.pastdue.model.User;

public class UserStub {


    private static Map<String, User> users = new HashMap<String, User>();
    private static String id = "A4678419-9FBE-49DF-A7E0";

    // populating fake data
    static {
    	User a = new User("String id", "String firstname", "String lastname", "String email", "String password", "String birthDate");
        users.put(a.getId(), a);
        User b = new User("BString id", "BString firstname", "BString lastname", "BString email", "BString password", "BString birthDate");
        users.put(b.getId(), b);
        User c = new User("CString id", "CString firstname", "CString lastname", "CString email", "CString password", "CString birthDate");
        users.put(c.getId(), c);
    }

    public static List<User> list() {
        return new ArrayList<User>(users.values());
    }

    public static User create(User user) {
    	users.put(user.getId(), user);
        return user;
    }

    public static User get(String id) {
        return users.get(id);
    }

    public static User update(String id, User user) {
    	users.put(id, user);
        return  user;
    }

    public static User delete(String id) {
        return users.remove(id);
    }

}
