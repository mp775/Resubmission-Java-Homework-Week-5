package week5writinghomework;
import java.util.Map;
import java.util.HashMap;
public class HashMapExample {
    public static void main(String[] args) {

           HashMap<String,Integer> peopleNumber = new HashMap<>();
            // Add keys and values (Name, ID)
            peopleNumber.put("Monday", 102);
            peopleNumber.put("Tuesday", 103);
            peopleNumber.put("Wednesday", 104);
            peopleNumber.put("Thursday", 105);
            peopleNumber.put("Friday", 106);
            peopleNumber.put("Saturday", 101);
            peopleNumber.put("Sunday", 107);

            for (Map.Entry<String, Integer> peopleNum : peopleNumber.entrySet()) {
                System.out.println(peopleNum.getKey() + " = " + peopleNum.getValue());
            }

        }
    }


