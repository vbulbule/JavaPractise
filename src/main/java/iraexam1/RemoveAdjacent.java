package iraexam1;

public class RemoveAdjacent {


    public static void main(String[] args) {

        System.out.println(removeAdjacent("aadbbddddgggghf"));


    }

    public static String remove(String s){
        if(s.isEmpty() || s.length()==1)
            return s;

        char last_removed;

            if(s.charAt(0)== s.charAt(1)){

                int index =0;
                while(s.charAt(index)==s.charAt(0)&&index<s.length()){
                    index++;
                }
                return remove(s.substring(index));
            }
            return s.charAt(0)+remove(s.substring(1));
        }

        public static String removeAdjacent(String s){

            String res ="";
            while(res.length()!=s.length()){
                res = s;
                s = remove(res);
            }
            return res;
        }
    }



