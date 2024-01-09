public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {
    //    int[] a = allIndexOf(args[0], 'l');
    //    for (int i = 0; i < a.length; i++) {
    //     System.out.print (a[i] + ", ");
    // }
    System.out.println (camelCase(args[0]));
    }

    public static String capVowelsLowRest (String string) {
        String s = "";
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) >= 65 && string.charAt(i) <= 90) {
                if (string.charAt(i) == 'A' || string.charAt(i) == 'I' || string.charAt(i) == 'O' || string.charAt(i) == 'E' || string.charAt(i) == 'U' ) {
                    s += string.charAt(i);
                } else {
                    s += (char)(string.charAt(i) + 32);
                }
            } else if (string.charAt(i) >= 97 && string.charAt(i) <= 122) {
                if (string.charAt(i) == 'a' || string.charAt(i) == 'i' || string.charAt(i) == 'o' || string.charAt(i) == 'e' || string.charAt(i) == 'u' ) {
                    s += (char)(string.charAt(i) - 32);
                } else {
                    s += string.charAt(i);
                }
            } else {
                s += string.charAt(i);
            }
        }
        return s;
    }

    public static String camelCase (String string) {
        String s = "";
        boolean first = true;
        for (int i = 0; i < string.length(); i++) {
            if (s == "") first = true;
            if (string.charAt(i) == ' ' && i != 0) {
                first = false;
            }
            if (first == true) {
                if (string.charAt(i) >= 65 && string.charAt(i) <= 90) {
                    s += (char)(string.charAt(i) + 32);
                } else if (string.charAt(i) >= 97 && string.charAt(i) <= 122) {
                    s += string.charAt(i);
                }
            } else {
                if (string.charAt(i - 1) == ' ') {
                    if (string.charAt(i) >= 65 && string.charAt(i) <= 90) {
                        s += string.charAt(i);
                    } else if (string.charAt(i) >= 97 && string.charAt(i) <= 122) {
                        s += (char)(string.charAt(i) - 32);
                    }
                } else if (string.charAt(i) >= 65 && string.charAt(i) <= 90) {
                    s += (char)(string.charAt(i) + 32);
                } else if (string.charAt(i) >= 97 && string.charAt(i) <= 122) {
                    s += string.charAt(i);
                }
            }
        }
        return s;
    }

    public static int[] allIndexOf (String string, char chr) {
        int cnt = 0;
        int iCount = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == chr) {
                cnt++;
            }
        }
        int[] indexOf = new int[cnt];
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == chr) {
                indexOf[iCount] = i;
                iCount++;
            }
        }
        return indexOf;
    }
}
