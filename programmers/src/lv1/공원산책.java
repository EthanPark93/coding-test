package lv1;

class 공원산책 {
    public int[] solution(String[] park, String[] routes) {
        int sy = 0;
        int sx = 0;

        char[][] arr = new char[park.length][park[0].length()];

        for(int i = 0; i < park.length; i++){
            arr[i] = park[i].toCharArray();

            if(park[i].contains("S")){
                sy = i;
                sx = park[i].indexOf("S");
            }
        }

        for(String st : routes){
            String direction = st.split(" ")[0];
            int n = Integer.parseInt(st.split(" ")[1]);

            int tempY = sy;
            int tempX = sx;

            for(int i = 0; i < n; i++){
                if(direction.equals("E")) tempX++;
                else if(direction.equals("W")) tempX--;
                else if(direction.equals("S")) tempY++;
                else tempY--;

                if(tempX >=0 && tempY >=0 && tempY < arr.length && tempX < arr[0].length){
                    if(arr[tempY][tempX] == 'X') break;

                    if(i == n-1){
                        sy = tempY;
                        sx = tempX;
                    }
                }
            }
        }

        return new int[] {sy, sx};
    }
}