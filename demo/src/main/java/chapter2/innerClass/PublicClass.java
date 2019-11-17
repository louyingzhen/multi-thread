package chapter2.innerClass;

import lombok.Data;

@Data
public class PublicClass {
    private String username;
    private String password;

    @Data
    class PrivateClass{
        private String age;
        private String address;

    }
}
