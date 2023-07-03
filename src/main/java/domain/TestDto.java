package domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class TestDto {

    public String hello() {
        return "hello";
    }

    public String hi() {
        return "hi";
    }

    public String bye() {
        return "bye";
    }
}
