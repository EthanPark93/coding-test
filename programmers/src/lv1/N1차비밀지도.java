package lv1;

public class N1차비밀지도 {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for (int i = 0; i < arr1.length; i++) {
            String a = Integer.toBinaryString(arr1[i]);
            String b = Integer.toBinaryString(arr2[i]);
            String one = "";

            for (int j = 0; j < n; j++) {
                if (a.length() < n) a = "0" + a;
                if (b.length() < n) b = "0" + b;
            }

            for (int j = 0; j < n; j++) {
                if (a.charAt(j) == '1' || b.charAt(j) == '1') one += "#";
                else one += " ";
            }
            answer[i] = one;
        }

        return answer;
    }
}

//class N1차비밀지도 {
//    public String[] solution(int n, int[] arr1, int[] arr2) {
//        String[] answer = new String[n];
//        String temp;
//
//        for(int i = 0 ; i < n ; i++){
//            temp = String.format("%16s", Integer.toBinaryString(arr1[i] | arr2[i]));
//            temp = temp.substring(temp.length() - n);
//            temp = temp.replaceAll("1", "#");
//            temp = temp.replaceAll("0", " ");
//            answer[i] = temp;
//        }
//
//        return answer;
//    }
//}