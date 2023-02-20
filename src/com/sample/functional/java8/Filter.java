package com.sample.functional.java8;

import com.sample.functional.dto.UserDTO;

import java.util.List;

public class Filter {

    public static void main(String[] args) {

        findUserByIdAndPrintAge(getUserList(), 143);
        findUserByUserIdAndPrintAge(getUserList(), "ved");
    }

    private static void findUserByUserIdAndPrintAge(List<UserDTO> userList, String userID) {
        UserDTO user = userList.stream().filter(userDto -> userDto.getUserId().equals(userID)).findAny().get();
        System.out.println(user.getAge());
    }

    private static void findUserByIdAndPrintAge(List<UserDTO> userList, int id) {
        UserDTO user = userList.stream().filter(userDto -> userDto.getId()==(id)).findAny().get();
        System.out.println(user.getUserId());
    }

    private static List<UserDTO> getUserList() {

        return List.of(new UserDTO("ved", 26, 123),
                new UserDTO("ven", 29, 143), new UserDTO("vee", 26, 253));
    }
}
