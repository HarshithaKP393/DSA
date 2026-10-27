package String;

class ReverseString{
    public static void main(String[] args) {
        String str = "Hello";
        char[] ch = str.toCharArray();
        int num = ch.length;
        int l =0;
        int r = num-1;
        while(l<r){
            ch[l] = (char)(ch[l] + ch[r]);
            ch[r] = (char)(ch[l] - ch[r]);
            ch[l] = (char)(ch[l] - ch[r]);

            l++;
            r--;
        }

        String str1 = new String(ch);
        System.out.println(str1);
    }
}