public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder lcp = new StringBuilder();

        for (int i = 0; i < strs[0].length(); i++) {
            for (String s: strs)
                if (s.length() <= i || s.charAt(i) != strs[0].charAt(i))
                    return lcp.toString();
            lcp.append(strs[0].charAt(i));
        }
        return lcp.toString();
    }
}
