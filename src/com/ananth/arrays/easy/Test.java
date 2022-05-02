// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Test {
    public static void main(String[] args) {
        System.out.println(strstr("ccdeecbdfedcbabfdfaebdaf", "fecfacbccfe"));
    }

    static int strstr(String s, String x) {
        int position = -1;
        if(x.length() > s.length())
            return position;
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i)==x.charAt(0)) {
                int j=i+1;
                int k=1;

                while(k<x.length() && j<s.length() && s.charAt(j)==x.charAt(k)){
                    j++;k++;
                }
                if(k==x.length()) {
                    position = i;
                    break;
                }
            }
        }
        return position;
    }
}