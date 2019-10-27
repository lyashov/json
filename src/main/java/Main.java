import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
    public static void main(String[] args) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();

        SomeData someData = new SomeData();
        someData.setParam1(100);
        someData.setParam2(true);
        someData.setParam3("Test");
        someData.setArr(new int[]{1,2,3,4,5});

        String str = objectMapper.writeValueAsString(someData);
        System.out.println(str);

        SomeData sd = objectMapper.readValue(str, SomeData.class);
        System.out.println(sd);

    }
}
