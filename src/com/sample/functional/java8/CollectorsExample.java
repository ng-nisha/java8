package com.sample.functional.java8;

import com.sample.functional.dto.UserDTO;

import java.util.List;
import java.util.stream.Collectors;

public class CollectorsExample {

    public static void main(String[] args) {
        collectIdsByAge(getUserList(), 22);
        findUserByUserIdAndPrintAge(getUserList(), "ved");
    }

    private static void findUserByUserIdAndPrintAge(List<UserDTO> userList, String userID) {
        UserDTO user = userList.stream().filter(userDto -> userDto.getUserId().equals(userID)).findAny().get();
        System.out.println(user.getAge());
    }

    private static void collectIdsByAge(List<UserDTO> userList, int age) {
        List<Integer> ids = userList.stream().filter(userDto -> userDto.getAge() > age).map(UserDTO::getId)
                .collect(Collectors.toList());
        System.out.println(ids);
    }

    private static List<UserDTO> getUserList() {
        return List.of(new UserDTO("ved", 26, 123),
                new UserDTO("ven", 29, 143), new UserDTO("vee", 26, 253));
    }
}
