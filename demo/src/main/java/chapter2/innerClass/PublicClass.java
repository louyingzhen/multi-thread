package chapter2.innerClass;

import lombok.Data;

@Data
public class PublicClass {
    private String username;
    private String password;

    @Data
    class privateClass{
        private String age;
        private String address;

    }
}
