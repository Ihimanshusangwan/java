class stringCompression {
    public static String compress(String str) {
        StringBuilder sb = new StringBuilder("");
        for(int i = 0; i<str.length(); i++) {
            int count = 1;
            while (i < str.length() -1 && str.charAt(i) == str.charAt(i+1)) {
                i++;
                count++;
            }
            sb.append(str.charAt(i));
            if ( count > 1) {
                sb.append(Integer.toString(count));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String string = "aaabc";
        System.out.println(compress(string)); 
    }
    
}