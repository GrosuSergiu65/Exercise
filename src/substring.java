public class substring {
    public static void main(String[] args) {
        System.out.println(subst("ozymandias"));
        System.out.println(subst("bzoo"));
        System.out.println(subst("oxx"));
        System.out.println(subst(""));
    }
    public static String subst(String str){
        if(str.startsWith("oz")){ return str.substring(0, 2);
        }else if(str.startsWith("o")){return str.substring(0,1);}
        else if (str.length()>=2 && str.substring(1).startsWith("z")) {return str.substring(1,2);}
        else {return ""; }

    }
    }
