package javaStreamsExtended;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalPractice {
}

class GetLengthOfTheStringIfStrIsNullReturn0 {
    public static void main(String args[]) {
        String str = "li";

        int len = Optional.ofNullable(str)
                .map(n -> str.length())
                .orElse(0);
        System.out.println(len);
    }
}

class CodeToConvertANullableListIntoAnOptionalThenGetSizeAndIfTheListIsNullReturnMinus1 {
    public static void main(String args[]) {
        List<String> li = Arrays.asList("Shreya", "Prateek", "Minni");
        int size = Optional.ofNullable(li)
                .map(List::size)
                .orElse(-1);
        System.out.println(size);
    }
}

class ThrowIllegalArgumentExceptionPasswordMissingifvaluenotpresent {
    public static void main(String args[]) {
        Optional<String> password = Optional.empty();
        String pwd = password.orElseThrow(() -> new IllegalArgumentException("Password Missing"));
        System.out.println(pwd);
    }
}

class MultiplyTheValueBy10OnlyIfPresentOtherwiseDoNothing {
    public static void main(String args[]) {
        Optional<Integer> val = Optional.of(1);
        val = val.map(n -> n * 100);
        System.out.println(val);
    }
}

class ConvertOptionalStringCityIntoUppercaseOnlyIfValueExistsOtherwiseReturnAnEmptyOptional {
    public static void main(String[] args) {
        Optional<String> city = Optional.ofNullable(null);
        city = city.map(String::toUpperCase);
        System.out.println(city);
    }
}
// Given a String email, print "Email present" if not null, otherwise print "No email" using Optional.ifPresentOrElse.
class PrintEmail{
    public static void main(String[] args) {
        Optional<String> email = Optional.ofNullable("email");
        email.ifPresentOrElse(e -> System.out.println("Email Present"),() -> System.out.println("No email"));
    }

}