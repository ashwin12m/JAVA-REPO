public class String3 {
        public static void main(String[] args) {
            String str1="    Learn Java    ";
            int result;
            String re;
    
            result = str1.indexOf("J");
            System.out.println(result);
    
            result = str1.indexOf("a");
            System.out.println(result);
    
            result = str1.indexOf("j");
            System.out.println(result);
    
            result = str1.indexOf("ava");
            System.out.println(result);
    
            result = str1.indexOf("java");
            System.out.println(result);
    
            result = str1.indexOf("");
            System.out.println(result);

            result = str1.indexOf("a",4);
            System.out.println(result);

            result = str1.indexOf("Java",4);
            System.out.println(result);

            re = str1.toLowerCase();
            System.out.println(re);

            re = str1.toUpperCase();
            System.out.println(re);

            re = str1.trim();
            System.out.println(re);

            result = str1.length();
            System.out.println(result);

            String str2 = "Khao Mava";
            re = str1 + str2 + "   Hudi Bawa";
            System.out.println(re);

            boolean b1 = str2.equals("khao mava");
            System.out.println(b1);

            b1 = str2.equalsIgnoreCase("khao mava");
            System.out.println(b1);
        }
    }