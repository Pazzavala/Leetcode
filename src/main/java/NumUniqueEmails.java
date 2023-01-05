import java.util.Arrays;
import java.util.HashSet;

public class NumUniqueEmails {
    public int numUniqueEmails(String[] emails) {
        HashSet<String> unique = new HashSet<>();
        int len = emails.length;
        String[] local = new String[len];
        String[] domain = new String[len];
        String[] result;
        int i = 0;

        for (String email : emails) {
            result = email.split("@");
            local[i] = result[0];
            int plusIndex = local[i].indexOf('+');
            if (plusIndex > 0)
                local[i] = local[i].substring(0, plusIndex);
            domain[i] = result[1];

            unique.add(local[i] + "@" + domain[i++]);
        }
        return unique.size();
    }

    public static void main(String[] args) {
        NumUniqueEmails num = new NumUniqueEmails();

        int uniqueNum = num.numUniqueEmails(new String[]{"Hello@bye", "hey+dwajdhadhi@bye", "Hello@bye", "Hell@obye"});
        System.out.print(uniqueNum);
    }
}
