package jp.ac.uryukyu.ie.e185721;


public class Exception {
    public static void main(String[] args) {
        String str = "百二十三";

        int value = Integer.parseInt(str);
    }
}

/*public class Exception {
    public static void main(String[] args) {
        try {
            String str = null;
            System.out.println(str.length());
        }catch (NullPointerException e){
            System.out.println("NullPointerExceptionが発生しました。");
            System.out.println(e.getMessage());
        }

    }

}*/
